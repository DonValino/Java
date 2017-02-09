package Lab9;

/**
 * Created by x00112730 on 21/10/2014.
 */
public class Sphere extends ThreeDShape {

    //Member Variables

    //Constructor
    public Sphere(int x,int y,int l,int w,int d)
    {
        super(x,y,l,w,d);
    }

    //getName()
    public String getName()
    {
        return "Sphere";
    }

    //getRadius
    public int getRadius()
    {
        return getHeight() / 2;
    }

    //getArea()
    public int getArea()
    {
        int area = (int) (4 * Math.PI * (getRadius() * getRadius()));
        return area;
    }

    //getVolume
    public int getVolume()
    {
        int vol = (int) ((4.0/3.0) * (Math.PI) * (getRadius() * getRadius() * getRadius()));
        return vol;
    }

    //toString
    public String toString()
    {
        return getName() + super.toString() + " radius : " + getRadius();
    }
}
