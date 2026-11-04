package se.lexicon;

public class CheckingAccount extends Account {

    double monthlyFee;

    public CheckingAccount(String holder, double balance, double monthlyFee) {
        super(holder, balance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    void processMonth() {
        // deducts monthlyFee from balance; prints: [holder]: monthly fee charged
        double newBalance = getBalance()-monthlyFee;
        setBalance(newBalance);
        IO.println(getHolder() + ": monthly fee charged");
    }
}
