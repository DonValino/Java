package SampleCA;

/**
 * Created by x00112730 on 10/10/2014.
 */
public class SavingsAccount extends BankAccount{
    //Member Variables
    private double interestRate;

    //Constructor
    public SavingsAccount(String name,int number,double balance,double interestRateIn)
    {
        super(name,number,balance);
        interestRate = interestRateIn;
    }

    //Getter
    public double getInterestRate()
    {
        return interestRate;
    }

    //Setter
    public void setInterestRate(double i)
    {
        interestRate = i;
    }

    //Withdraw()
    public void withdraw(double amount)
    {
        if(amount > getBalance())
        {
            System.out.println("Sorry there isn't enough balance in your account to make this transanction ");
        }
        else
        {
            setBalance(amount);
        }
    }

    //calcInterest
    public void calcInterest()
    {
        double interest = (interestRate * getBalance())/100;
        lodge(interest);
    }
}

