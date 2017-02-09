package Lab9;

/**
 * Created by x00112730 on 21/10/2014.
 */
public abstract class Shape {

    //Member Variables
    private int x;
    private int y;
    private static int total;

    //Constructor
    public Shape(int xIn,int yIn)
    {
        x = xIn;
        y = yIn;
        total++;
    }

    //Getter Method
    public int getX()
    {
        return x;
    }

    //Getter Method
    public int getY()
    {
        return y;
    }

    //toString()
    public String toString()
    {
        return "(" + x + "," + y + ")" ;
    }

    //getName()
    public abstract String getName();

    public static int gettotal()
    {
        return total;
    }
}
