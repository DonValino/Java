package Lab5;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class Triangle extends Shape {

    //Member Variables
    private double base;
    private double height;


    //Constructor
    public Triangle(String colour,double baseIn,double heightIn)
    {
        super(colour);
        base = baseIn;
        height = heightIn;
    }

    //Print Method
    public void print()
    {
        super.print();
        System.out.println("Height is : " + height + "\n Base is : " + base);
    }

    //calcArea()
    public double calcArea()
    {
        double area = 0.5*base * height;
        return area;
    }

}
