package Model;

/**
 * Created by JakeValino on 01/05/2015.
 */


public class BankAccount {
    private double
            balance;
    private String accountName;

    public BankAccount(String accountName, double balance) {
        this.balance=balance;
        this.accountName=accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() { return balance; }



    public void deposit(int amount) {
        balance+= amount;
    }


    public void withdraw(int amount) {
        balance-= amount;
    }

    public boolean isOverdrawn() {
        if (balance <0)
            return true;
        else
            return false;
    }

    public void chargeInterest(double rate) {
        if (isOverdrawn())
        {
            double interest = balance*rate;
            this.balance = balance + interest;
        }
    }
}
