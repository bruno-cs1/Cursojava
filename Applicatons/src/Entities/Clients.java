package Entities;

public class Clients {

    private String holder;
    private int numberAccount;
    private double initialDeposit;

    public Clients() {
    
    }

    public Clients(String holder, int numberAccount, double initialDeposit) {
        this.holder = holder;
        this.numberAccount = numberAccount;
        deposit (initialDeposit);
    }
    
     public Clients(String holder, int numberAccount) {
        this.holder = holder;
        this.numberAccount = numberAccount;
        
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(double initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public void deposit(double deposit){
        initialDeposit += deposit;
             
    }
    
    public void withdraw(double withdraw){
        initialDeposit -= (withdraw +5);
    }
}
