package se.lexicon;

public class LoanAccount extends Account{
    private double loanRate;

    public LoanAccount(String holder, double balance, double loanRate) {
        super(holder, balance);
        this.loanRate = loanRate;
    }

    @Override
    void processMonth() {
        //adds balance * loanRate to balance (debt grows); prints: [holder]: loan interest added
        double interest = getBalance()*loanRate;
        deposit(interest);
        IO.println(getHolder() + ": loan interest added");


    }
}
