package Lab2Exercise2;

/**
 * Created by x00112730 on 23/09/2014.
 */
/*Order Super class
 * Jake Valino
 * 23/09/2014
 */

public class Order
{
    //Instance variable
    private String customerName;
    private int customerNumber;
    private int qtyOrdered;
    private double price;
    protected double totalPrice;


    //Constuctor
    public Order(String customerNameIn,int customerNumberIn,int qtyOrderedIn,double priceIn)
    {
        customerName = customerNameIn;
        customerNumber = customerNumberIn;
        qtyOrdered = qtyOrderedIn;
        price = priceIn;
    }

    //Getter Method
    public String getCustomerName()
    {
        return customerName;
    }

    //Getter Method
    public int getCustomerNumber()
    {
        return customerNumber;
    }

    //Getter Method
    public int getQtyOrdered()
    {
        return qtyOrdered;
    }

    //Getter Method
    public double getPrice()
    {
        return price;
    }

    //Setter Method
    public void setCustomerName(String nameIn)
    {
        customerName = nameIn;
    }

    //Setter Method
    public void setCustomerNumber(int numberIn)
    {
        customerNumber = numberIn;
    }

    //Setter Method
    public void setQtyOrdered(int qtyOrderedIn)
    {
        qtyOrdered = qtyOrderedIn;
    }

    //Setter Method
    public void setPrice(double priceIn)
    {
        price = priceIn;
    }

    //totalPrice Method
    public void computeTotalPrice()
    {
        totalPrice = (qtyOrdered * price);
    }

    //Print Method
    public void print()
    {
        System.out.println("The customer name is " + customerName);
        System.out.println("The customer number is " + customerNumber);
        System.out.println("The quantity ordered is " + qtyOrdered);
        System.out.println("The price is " + price);
        System.out.println("The total price is " + totalPrice);
    }




}