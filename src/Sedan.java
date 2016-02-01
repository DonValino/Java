/**
 * Created by edoncva on 01/02/2016.
 */
public abstract class Sedan extends Vehicle {
    //Instance Variables
    private static final int numberOfDoors = 4;

    //Constructor
    public Sedan(int plateNumber,String colour)
    {
        super(plateNumber,colour);

    }

    //Getters
    public int getNumberOfDoors()
    {
        return numberOfDoors;
    }
}
