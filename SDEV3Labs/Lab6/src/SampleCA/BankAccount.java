package SampleCA;

/**
 * Created by x00112730 on 10/10/2014.
 */
public class BankAccount {
    //Member Variables
    private String name;
    private int number;
    private double balance;

    //Constructor
    public BankAccount(String nameIn,int numberIn,double balanceIn)
    {
        name = nameIn;
        number = numberIn;
        balance = balanceIn;
    }

    //Getter
    public String getName()
    {
        return name;
    }
    //Getter
    public int getNumber()
    {
        return number;
    }
    //Getter
    public double getBalance()
    {
        return balance;
    }
    //Setter
    public void setName(String nameIn)
    {
        name = nameIn;
    }

    //Setter
    public void setNumber(int numberIn)
    {
        number = numberIn;
    }
    //Setter
    public void setBalance(double balanceIn)
    {
        balance =  balanceIn;
    }

    //Lodge Method
    public void lodge(double in)
    {
        balance += in;
    }

    //Withdraw
    public void widraw(double out)
    {
        if(balance >= out) {
            balance -= out;
        }
        else
        {
            System.out.println("Sorry you don't have enough balance in your account to withdraw this amount");
        }
    }

    //transfer
    public void transfer(double amount,BankAccount m)
    {
        m.lodge(amount);
        widraw(amount);
    }

    //toString
    public String toString()
    {
        return "The name is :" + name + "\n The Bank Account Number is : " + number + "The Account Balance is : " + balance;
    }
}
