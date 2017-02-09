package SDEVLAB7;

/**
 * Created by Valino on 14/10/14.
 */
public class Employee extends StaffMember{

    //member Variables
    private String rsiNumber;
    protected double salaryRate;

    //Constructor
    public Employee(String n,String d,String p,String rsiNumberIn,double salaryRateIn)
    {
        super(n,d,p);
        rsiNumber = rsiNumberIn;
        salaryRate = salaryRateIn;
    }

    //toString()
    public String toString()
    {
        return super.toString() + "\nRSI Number : " + rsiNumber;

    }

    //pay()
    public double pay()
    {
        return salaryRate;
    }

}
