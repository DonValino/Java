package Lab2Exercise2;

/**
 * Created by x00112730 on 23/09/2014.
 */
public class ShippedOrder extends Order {
    //Constructor
    public ShippedOrder(String customerNameIn,int customerNumberIn,int qtyOrderedIn,double priceIn)
    {
        super(customerNameIn,customerNumberIn,qtyOrderedIn,priceIn);
    }

    //Over Written computeTotalPrice
    public void computeTotalPrice()
    {
        double handlingCharge = 5.0;
        super.computeTotalPrice();
        totalPrice += handlingCharge;
    }

    public void print()
    {
        super.print();

    }


}
