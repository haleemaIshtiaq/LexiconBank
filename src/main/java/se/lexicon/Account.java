package se.lexicon;

public abstract class Account {

 private String holder;
 private double balance;
   //Constructor
    public Account(String holder, double balance) {
        if (holder == null || holder.isBlank())
            throw new IllegalArgumentException("Name cannot be empty.");
        if (balance < 0)
            throw new IllegalArgumentException("Balance must be positive.");

        this.holder = holder;
        this.balance = balance;
    }
 //Getters
    public String getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //Other methods
    public void deposit(double amount){
        if (amount <= 0)
            throw new IllegalArgumentException("Raise amount must be positive.");
        this.balance += amount;
        IO.println(holder + "'s new balance: " + balance);
    }

    abstract void processMonth();

 public void printSummary(){
     IO.println(holder + "'s balance: " + balance);
 }

}
