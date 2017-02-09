package CA2_2012;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class Eurozone extends CarClass {

    //Member Variable
    private double discount;

    //Constructor
    public Eurozone(double price, double dutyRate,String model,double discountIn)
    {
        super(price,dutyRate,model);
        discount = discountIn;
    }

    //getter()
    public double getDiscount()
    {
        return discount;
    }

    //setter()
    public void setDiscount(double am)
    {
         discount = am;
    }

    //PrintMethod
    public String toString()
    {
        return super.toString() + "\n Discount is : " + discount;
    }

}
