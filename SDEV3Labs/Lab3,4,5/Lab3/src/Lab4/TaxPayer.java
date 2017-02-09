package Lab4;

/**
 * Created by x00112730 on 30/09/2014.
 */
public class TaxPayer {
    //Instance Variables
    private int rsiNo;
    private double grossIncome;

    //Default constructor
    public TaxPayer()
    {
        rsiNo = 0;
        grossIncome = 0;
    }

    //Overloaded constructor
    public TaxPayer(int rsiNoIn,double grossIncomeIn)
    {
        rsiNo = rsiNoIn;
        grossIncome= grossIncomeIn;
    }

    //Getter method
    public int getRsiNo()
    {
        return rsiNo;
    }

    //Getter Method
    public double getGrossIncome() {
        return grossIncome;
    }


}
