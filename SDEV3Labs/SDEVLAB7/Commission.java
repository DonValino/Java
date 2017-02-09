package SDEVLAB7;

/**
 * Created by Valino on 14/10/14.
 */
public class Commission extends Hourly{

    //Member Variables
    private double totalSales;
    private double commisionRate;

    //Constructor
    public Commission(String n,String d,String p,String rsi,double sal,double com)
    {
        super(n,d,p,rsi,sal);
        commisionRate = com;
        totalSales = 0;
    }

    //addSales()
    public void addSales(double amount)
    {
        totalSales += amount;
    }

    //pay()
    public double pay()
    {
        double pay = ((salaryRate * hoursWorked) + (totalSales * commisionRate));
        return pay;
    }

    //toString()
    public String toString()
    {
        return super.toString() + "\nTotal Sales : " + totalSales;
    }
}
