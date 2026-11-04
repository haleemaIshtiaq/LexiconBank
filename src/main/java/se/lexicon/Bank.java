package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private String name;
    List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();//It can hold all three types(polymorphism)
    }
    public void addAccount(Account account){
        accounts.add(account);

    }
    public void processAllAccounts(){
        for(Account account : accounts){
            //Java executes the correct overridden method depending on the actual object type(run time polymorphism)
            account.processMonth();
        }
    }
    public void  printAllSummaries(){
        for(Account account : accounts){
            account.printSummary();
        }
    }
}
