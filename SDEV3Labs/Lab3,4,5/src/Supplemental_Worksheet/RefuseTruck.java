package Supplemental_Worksheet;

/**
 * Created by x00112730 on 03/10/2014.
 */
public class RefuseTruck {
    //Instance Variables
    private int maxBins;
    protected int noOfBinsDeclined;
    private int noOfBinsCollected;
    private double ratePerKg;
    private double totalWeight;

    //Constructor
    public RefuseTruck(int maxBinsIn,double ratePerKgIn)
    {
        maxBins = maxBinsIn;
        ratePerKg = ratePerKgIn;
        noOfBinsDeclined = 0;

    }

    //getNoOfBinsCollected
    public int getNoOfBinsCollected()
    {
        return noOfBinsCollected;
    }

    //getMaxBins
    public int getMaxBins()
    {
        return maxBins;
    }

    //
    public void addDecline()
    {
        noOfBinsDeclined++;
    }

    //collectBin Method
    public void collectBin(double totalWeightIn)
    {
        if(totalWeightIn > 100)
        {
            System.out.println("Weight Limit Exceeded ");
            noOfBinsDeclined++;

        }
        else
        {
            noOfBinsCollected++;
            totalWeight += totalWeightIn;
        }
    }

    //printStats Method
    public String toString()
    {
        double average = ((totalWeight * ratePerKg) / noOfBinsCollected);
        return "Number of bins collected : " + noOfBinsCollected + "\n Number of Bins Not Collected : " + noOfBinsDeclined + "\n Average cost per collected bin : € " + average;
    }


}





