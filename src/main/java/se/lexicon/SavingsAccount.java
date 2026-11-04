package se.lexicon;

public class SavingsAccount extends Account{

    private double interestRate;

    public SavingsAccount(String holder, double balance, double interestRate) {
        super(holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    void processMonth() {
        //adds balance * interestRate to balance; prints: [holder]: interest credited
      double interest = getBalance()*interestRate;
      deposit(interest);
      IO.println(getHolder() + ": interest credited");

    }
}
