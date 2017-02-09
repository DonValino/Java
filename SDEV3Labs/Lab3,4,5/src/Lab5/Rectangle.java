package Lab5;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class Rectangle extends Shape {
    //Member Variables
    protected double length;
    protected double width;

    public Rectangle(String colour,double legnthIn,double widthIn)
    {
        super(colour);
        length = legnthIn;
        width = widthIn;
    }

    public void print()
    {
        super.print();
        System.out.println("Length is : " + length + "\n Width is : " + width);
    }


    public double calcArea()
    {
        double area = length * width;
        return area;
    }
}
