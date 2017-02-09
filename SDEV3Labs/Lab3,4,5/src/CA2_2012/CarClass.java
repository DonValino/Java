package CA2_2012;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class CarClass {
    //Member Variables
    private double price;
    protected double dutyRate;
    private String carModel;

    public CarClass(double priceIn,double dutyRateIn,String carModelIn)
    {
        price = priceIn;
        dutyRate = dutyRateIn;
        carModel = carModelIn;
    }

    //getter
    public double getPrice()
    {
        return price;
    }

    //getter
    public double getDutyRate()
    {
        return dutyRate;
    }

    //setter
    public void setPrice(double priceIn)
    {
        price = priceIn;
    }


    //setter
    public void setCarModel(String carModelIn)
    {
        carModel = carModelIn;
    }

    //toString Method
    public String toString()
    {
        return " Price is : " + price + "\n Duty Rate is : " + dutyRate + "\n Car model is : " + carModel;
    }


}
