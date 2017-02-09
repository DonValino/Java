package Lab9;

/**
 * Created by x00112730 on 21/10/2014.
 */
public class Square extends TwoDShape {
    //Member Variables

    //Constructor
    public Square(int x,int y,int heightIn,int widthIn)
    {
        super(x,y,heightIn,widthIn);
    }

    //getName
    public String getName()
    {
        return "Square";
    }

    //getSide()
    public int getSide()
    {
        int side = (int) (getHeight());
        return side;
    }


    //getArea()
    public int getArea()
    {
        int area = (int) (getSide() * getSide());
        return area;
    }

    //toString
    public String toString()
    {
        return  getName() + super.toString() + " Side is : " + getSide();
    }

}
