package CA2_2012;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class TestCar {
    public static void main(String [] args)
    {
        CarClass [] ob1 = new CarClass [4];
        double total = 0;


        ob1[0] = new Eurozone(35000,0.05,"BMW",0.02);
        ob1[1] = new JapaneseImport(40000,0.07,"Honda","Tokyo");
        ob1[2] = new JapaneseImport(45000,0.06,"Toyota","Osaka");
        ob1[3] = new JapaneseImport(43000,0.08,"Nissan","Osaka");

        for(int i = 0; i < ob1.length;i++)
        {
            System.out.println(ob1[i]);

            if(ob1[i] instanceof JapaneseImport)
            {
                JapaneseImport c = (JapaneseImport) ob1[i];
                System.out.println("The amount of duty paid is : " +c.calcDuty());
                if(c.getPortName().equalsIgnoreCase("osaka"))
                {
                    total = total + c.getDuty();

                }
            }
            System.out.println("");

        }
        System.out.println("The total amount of Duty paid is " + total);



    }
}
