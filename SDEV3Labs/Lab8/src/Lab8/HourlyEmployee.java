package Lab8;

/**
 * Created by x00112730 on 17/10/2014.
 */
public class HourlyEmployee extends Employee {

    //Member Variables
    private int hoursWorked;
    private double rateOfPay;
    private  double totalTax;

    public HourlyEmployee(String f,String l,String rs,int h,double r)
    {
        super(f,l,rs);
        hoursWorked = h;
        rateOfPay = r;
    }

    //getter
    public int getHoursWorked()
    {
        return hoursWorked;
    }

    //setter
    public void setHoursWorked(int i)
    {
        hoursWorked = i;
    }

    //getter
    public double getRateOfPay()
    {
        return rateOfPay;
    }

    //setter
    public void setRateOfPay(double d)
    {
        rateOfPay = d;
    }

    //getPaymentAmount()
    public double getPaymentAmount()
    {
        double amount = (hoursWorked * rateOfPay);
        if(amount > 200 && amount <= 300)
        {
            double tax = ((amount /100) * 23);
            amount -= tax;
            totalTax += tax;

        }
        else
        {
            if(amount > 300)
            {
                double over300 = amount-300;
                double tax = (((over300)/100) * 42);
                double tax1 = ((300/100) * 23);
                double to = tax + tax1;
                amount = amount - to;
                totalTax += to;
            }

        }
        return amount;
    }

    //toString
    public String toString()
    {
        return super.toString() + "\n" + getFName() + " " + getLName() + " is a salaried employee";
    }

    public  double getTotalTax()
    {
        return totalTax;
    }
}
