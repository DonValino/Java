package CA2_2012;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class JapaneseImport extends CarClass{
    //Member Variables
    private String portName;
    protected double duty;

    public JapaneseImport(double price,double dutyRate,String carModel,String portNameIn)
    {
        super(price,dutyRate,carModel);
        portName = portNameIn;
    }

    //Setter
    public String getPortName()
    {
        return portName;
    }

    //Getter
    public double getDuty()
    {
        return duty;
    }

    //Getter
    public void setPortName(String port)
    {
        portName = port;
    }

    //calcDuty()
    public double calcDuty()
    {
         duty = dutyRate * getPrice();
        if(portName.equalsIgnoreCase("Osaka"))
        {
            double extra = (duty /100) * 5;
        }
        return duty;
    }

    //PrintMethod
    public String toString()
    {
        return super.toString() + "\n Port Name is : " + portName;
    }



}
