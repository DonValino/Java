package Lab4Exercise2;

/**
 * Created by x00112730 on 30/09/2014.
 */
public class Friend {
    //Instance Variable
    private String name;
    private int phoneNum;

    //Deafault Constructor
    public Friend()
    {
        name = "";
        phoneNum = 0;
    }

    //Overloaded Constructor
    public Friend(String nameIn, int phoneIn)
    {
        name = nameIn;
        phoneNum = phoneIn;
    }

    //Getther method for name
    public String getName()
    {
        return name;
    }

    //Getther method for phone
    public int getPhoneNum()
    {
        return phoneNum;
    }

    public String toString()
    {
        return "Customer Name : " + name + "\n Phone number : " + phoneNum;
    }


}
