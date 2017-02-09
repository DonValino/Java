package Lab9;

/**
 * Created by x00112730 on 21/10/2014.
 */
public abstract class ThreeDShape extends Shape {

    //Member Variables
    private int legnth;
    private int width;
    private int height;

    //Constructor
    public ThreeDShape(int x,int y,int l,int w,int d)
    {
        super(x,y);
        legnth = l;
        width = w;
        height = d;
    }

    //Getter Method
    public int getHeight()
    {
        return legnth;
    }

    //Getter Method
    public int getWidth()
    {
        return width;
    }

    //getter method
    public int getDepth()
    {
        return height;
    }

    //area()
    public abstract int getArea();

    //getVolume()
    public abstract int getVolume();


}
