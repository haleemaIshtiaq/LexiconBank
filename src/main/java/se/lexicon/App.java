package se.lexicon;

// How does Java know which version of processMonth() to run for each account?
//Java uses run time polymorphism.Although the accounts are stored in a List<Account> Java checks the actual object type
//at run time and executes its overridden method.
//Why can you not write new Account("Ali", 1000)?
//Because Account is an abstract class and Java does not allow us to instantiate abstract classes directly.

public class App {
    static void main() {
        Bank bank = new Bank("Lexicon Bank");
        bank.addAccount(new SavingsAccount("Ali" , 1000, 0.02));
        bank.addAccount(new CheckingAccount("Omer" , 500, 25));
        bank.addAccount(new LoanAccount("Haleema" , 5000, 0.03));

        IO.println("====  Welcome at Lexicon Bank  ==== ");
        IO.println("===== Initial Balance =====");
        bank.printAllSummaries();

        IO.println("=====Processes all accounts at month-end =====");
        bank.processAllAccounts();

        IO.println("===== Updated Balance =====");
        bank.printAllSummaries();

    }
}
