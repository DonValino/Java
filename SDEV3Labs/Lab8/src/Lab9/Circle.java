package Lab9;

/**
 * Created by x00112730 on 21/10/2014.
 */
public class Circle extends TwoDShape {

    //Member Variables

    //Constructor
    public Circle(int x,int y,int heigthIn,int widthIn)
    {
        super(x,y,heigthIn,widthIn);
    }

    //getName()
    public String getName()
    {
        return "Circle ";
    }

    //getRadius
    public int getRadius()
    {
        int radius = (int) (getHeight());
        return radius;
    }

    //Area()
    public int getArea()
    {
        int area = (int) (Math.PI * (getRadius() * getRadius()));
        return area;
    }

    //toString()
    public String toString()
    {
        return "Name is : " + getName() + super.toString() + " radius is : " + getRadius();
    }


}
