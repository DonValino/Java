package Lab9;

/**
 * Created by x00112730 on 21/10/2014.
 */
public abstract class TwoDShape extends Shape {

    //Member Variables
    private int height;
    private int width;

    //Constructor
    public TwoDShape(int x,int y,int heightIn,int widthIn)
    {
        super(x,y);
        height = heightIn;
        width = widthIn;
    }

    //Getter
    public int getHeight()
    {
        return height;
    }

    //Getter
    public int getWidth()
    {
        return width;
    }

    public abstract int getArea();
}
