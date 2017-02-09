package Lab6;

/**
 * Created by x00112730 on 10/10/2014.
 */
public class Musician extends Person{
    //Member Variables
    private String insName;

    //Constructor
    public Musician(String nameIn,String insNameIn)
    {
        super(nameIn);
        insName = insNameIn;
    }

    //Overridden Print Method
    public void print()
    {

        System.out.print("  \n" + " " + getName() +" plays  : " + insName);
    }

    //Getter Method
    public String getInsName()
    {
        return insName;
    }

    //setter Method
    public void setInsName(String nameIn)
    {
       insName = nameIn;
    }

}
