package SDEVLAB7;

/**
 * Created by Valino on 14/10/14.
 */
public class Volunteer extends StaffMember{

    //Constructor
    public Volunteer(String n,String d,String p)
    {
        super(n,d,p);
    }

    //pay()
    public double pay()
    {
        return 0;
    }

    //toString
    public String toString()
    {
       return super.toString() + "\nThanks";
    }

}
