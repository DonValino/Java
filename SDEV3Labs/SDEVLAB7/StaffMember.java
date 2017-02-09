package SDEVLAB7;

/**
 * Created by Valino on 14/10/14.
 */
public abstract class StaffMember {
    //Member Variables
    private String name;
    private String address;
    private String pNumber;

    //Constructor
    public StaffMember(String n,String d,String p)
    {
        name = n;
        address = d;
        pNumber = p;
    }

    //toString
    public String toString()
    {
        return "\nName : " + name + "\nAddress : " + address + "\nPhone : " + pNumber;
    }

    //pay()
    public abstract double pay();
}
