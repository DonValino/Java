package Lab5;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class Cylinder extends Circle {

    //Member Variables
    private double height;
    private double volume;

    //Constructor
    public Cylinder(String colour,double radius,double heightIn)
    {
        super(colour,radius);
        height = heightIn;
        volume = 0;
    }

    //Print Method
    public void print()
    {
        super.print();
        System.out.println("Height of cylinder is : " + height);
    }

    //calcArea()
    public double calcArea()
    {
        double surface = (2*3.14*radius*radius) + (2*3.14*radius*radius);
        return surface;
    }

    //calcVolume
    public double calcVolume()
    {
        volume = 3.14 *radius*radius*height;
        return volume;
    }



}
