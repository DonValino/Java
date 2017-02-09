package Lab8;

/**
 * Created by x00112730 on 17/10/2014.
 */
public class Invoice implements IPayable {

    //Member Variables
    private String description;
    private int number;
    private double price;
    private int qtyItem;
    private static int sum;
    private static double totalTax;

    public Invoice(String d,int n,double p,int q)
    {
        description = d;
        number = n;
        price = p;
        qtyItem = q;
        sum++;
    }

    //getter
    public String getDescription()
    {
        return description;
    }
    //setter
    public void setDescription(String f)
    {
        description = f;
    }


    //getter
    public int getNumber()
    {
        return number;
    }

    //setter
    public void setNumber(int n)
    {
        number = n;
    }


    //getter
    public double gerPrice()
    {
        return price;
    }

    //setter
    public void serPrice(double p)
    {
        price = p;
    }


    //getter
    public int getQty()
    {
        return qtyItem;
    }

    //setter
    public void setQty(int q)
    {
        qtyItem = q;
    }

    //toString
    public String toString()
    {
        return "\n Invoice " + "\nQuantity : " + qtyItem + "\nPricePerItem : " + price + "\nPartNumber : " + number + "\nPartDescription : " + description;
    }

    //getPaymentAmount()
    public double getPaymentAmount()
    {
        double  amount = (((price * qtyItem) / 100) * 23.5);
        price =(price * qtyItem) + amount;
        totalTax += amount;
        return price;

    }

    public static int getSum()
    {
        return sum;
    }

    public static double getTotalTax()
    {
        return totalTax;
    }



}
