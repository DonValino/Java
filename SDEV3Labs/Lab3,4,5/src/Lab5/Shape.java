package Lab5;

/**
 * Created by x00112730 on 07/10/2014.
 */
public abstract class Shape {


    //member variables
    protected String colour;
    protected double area;

    //Constructor
    public Shape(String colourIn)
    {
        colour = colourIn;
        area = 0;
    }

    public void print()
    {
        System.out.println("Colour :" + colour);
    }

    public abstract double calcArea();


}
