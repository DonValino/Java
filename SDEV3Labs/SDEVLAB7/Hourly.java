package SDEVLAB7;

/**
 * Created by Valino on 14/10/14.
 */
public class Hourly extends Employee{

    //Member Variables
    protected int hoursWorked;

    //Constructor
    public Hourly(String n,String d,String p,String rsi,double sal)
    {
        super(n,d,p,rsi,sal);
        hoursWorked = 0;
    }

    //addHours()
    public void addHours(int hours)
    {
        hoursWorked += hours;
    }

    //pay()
    public double pay()
    {
        return (salaryRate * hoursWorked);
    }

    //toString
    public String toString()
    {
        return super.toString() + "\nCurrent Hours : " + hoursWorked;
    }
}
