package Lab9;

/**
 * Created by x00112730 on 21/10/2014.
 */
public class Cube extends ThreeDShape {

    //Constructor
    public Cube(int x,int y,int l,int w,int d)
    {
        super(x,y,l,w,d);
    }

    //getName()
    public String getName()
    {
        return "Cube";
    }

    //getSide()
    public double getSide()
    {
        return getHeight();
    }

    //getArea()
    public int getArea()
    {
        int area = (int) (6 * getSide() * getSide());
        return area;
    }

    //getVolume()
    public int getVolume()
    {
        int volume = (int) (getSide() * getSide() * getSide());
        return volume;
    }

    //toString
    public String toString()
    {
        return getName() + super.toString();
    }
}
