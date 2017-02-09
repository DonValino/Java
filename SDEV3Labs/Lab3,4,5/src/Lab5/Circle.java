package Lab5;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class Circle extends Shape {

    //Member Variables
    protected double radius;

    //Constructor
    public Circle(String colour,double radiusIn)
    {
        super(colour);
        radius = radiusIn;
    }

    //Print Method
    public void print()
    {
        super.print();
        System.out.println("Radius is : " + radius);
    }

    public double calcArea()
    {
        double area = 3.14*radius*radius;
        return area;
    }
}
