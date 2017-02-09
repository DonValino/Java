package SampleCA;

/**
 * Created by x00112730 on 10/10/2014.
 */
public class CurrentAccount extends BankAccount {
    //Member Variables
    private final int NUM_FREE_TRANSACTION = 2;
    private final double FEE = 2.0;
    private double overDraftLimit;
    private int transactionCount;

    //Constructor
    public CurrentAccount(String name,int number,double balance, double overDraftLimitIn)
    {
        super(name,number,balance);
        transactionCount = 0;
        overDraftLimit = overDraftLimitIn;
    }

    //Getter
    public double getOverDraftLimit()
    {
        return overDraftLimit;
    }

    //Getter
    public int getTransactionCount()
    {
        return transactionCount;
    }

    //Setter
    public void setOverDraftLimit(double in)
    {
        overDraftLimit = in;
    }

    //Setter
    public void setTransactionCount()
    {
        transactionCount++;
    }

    //Lodge Method
    public void lodge(double in)
    {
        super.lodge(in);
        transactionCount++;
    }

    //Withdraw Method
    public void widraw(double out)
    {
        if(out <= getBalance()) {
            super.widraw(out);
        }
        else
        {
            System.out.println("Sorry not enough balance");
        }
    }

    //calcFees()
    public void calcFess()
    {
        if(transactionCount > 2)
        {
            double fee = ((transactionCount - NUM_FREE_TRANSACTION) * FEE);
            widraw(fee);
        }
    }

    //toString
    public String toString()
    {
        return super.toString() + "\n The OverDraft Limit is : " + overDraftLimit + "\n The transaction count is : " + transactionCount;
    }

}
