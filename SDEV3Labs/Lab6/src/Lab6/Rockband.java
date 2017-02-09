package Lab6;

/**
 * Created by x00112730 on 10/10/2014.
 */
public class Rockband {
    //Member Variables
    private String nameband;
    private String bandRecordLabel;
    private Musician [] c;

    //Constructor
    public Rockband(String namebandIn,String bandRecordLabelIn,String [] nameM,String [] nameInstrument)
    {
        nameband = namebandIn;
        bandRecordLabel = bandRecordLabelIn;
        c = new Musician[nameM.length];
        for(int i = 0; i < c.length;i++)
        {
            c[i] =  new Musician(nameM[i],nameInstrument[i]);
        }
    }
    public String getBandRecordLabel()
    {
        return bandRecordLabel;
    }
    //ChangeRecordLabel()
    public  Boolean changeRecordLabel(String nameIn)
    {
        Boolean s = false;

            if(nameIn.equalsIgnoreCase(bandRecordLabel))
              {
                return s = false;
              }
             else
                {
                bandRecordLabel = nameIn;
                s = true;
                return s;
                }

    }

    //Print Method
    public void print()
    {
        System.out.println("The band name is : " + nameband);
        System.out.println("The band Record Label is : " + bandRecordLabel);
        for(int i = 0; i < c.length;i++)
        {
            c[i].print();
        }

    }
}
