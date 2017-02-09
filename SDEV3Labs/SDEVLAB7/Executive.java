package SDEVLAB7;

/**
 * Created by Valino on 14/10/14.
 */
public class Executive  extends Employee{

    //Member Variables
    private double bonus;

    public Executive(String n,String d,String p,String rsi,double sa)
    {
        super(n,d,p,rsi,sa);
        bonus = 0;
    }

    //awardBonus()
    public void awardBonus(double amount)
    {
        bonus = amount;
    }

    //pay()
    public double pay()
    {
        double pay = salaryRate + bonus;
        return pay;
    }
}
