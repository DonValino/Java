/**
 * Created by edoncva on 01/02/2016.
 */
public class ChevroletLacetti extends Sedan {

    //Instance Variables
    private double price;

    //Constructor
    public ChevroletLacetti(int plateNumber,String colour,double priceIn)
    {
        super(plateNumber,colour);
        price = priceIn;
    }

    //Getters
    public double getPrice()
    {
        return price;
    }
}
