/**
 * Created by edoncva on 01/02/2016.
 */
public abstract class Vehicle {
    //Instance Varriable
    private int plateNumber;
    private String colour;

    //Constructor
    public Vehicle (int plateNumberIn,String colourIn)
    {
        plateNumber = plateNumberIn;
        colour = colourIn;
    }

    //Getters
    public int getPlateNumber()
    {
        return plateNumber;
    }

    public String getColour()
    {
        return colour;
    }


}
