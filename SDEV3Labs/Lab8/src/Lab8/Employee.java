package Lab8;

/**
 * Created by x00112730 on 17/10/2014.
 */
public abstract class Employee implements IPayable{

    //Member Variables
    private String fname;
    private String lName;
    private String rsiNum;
    private static int sum;

    public Employee(String f,String l,String rs)
    {
        fname = f;
        lName = l;
        rsiNum = rs;
        sum++;
    }

    //getter
    public String getFName()
    {
        return fname;
    }


    //setter
    public void setFName(String f)
    {
        fname = f;
    }

    //getter
    public String getLName()
    {
        return lName;
    }


    //setter
    public void setLName(String l)
    {
        lName = l;
    }


    //getter
    public String getRsiNumber()
    {
        return rsiNum;
    }

    //getter
    public void setRsiNumber(String s)
    {
        rsiNum = s;
    }

    //toString
    public String toString()
    {
        return "\nEmployee  " + "\nFirst Name : " + fname + "\nLast Name : " + lName + "\nRSI Number : " + rsiNum;
    }

    public static int getSum()
    {
        return sum;
    }

}
