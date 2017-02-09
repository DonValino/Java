package Supplemental_Worksheet;

/**
 * Created by x00112730 on 03/10/2014.
 */
import java.util.Scanner;
public class TestRefuseTruck {
    public static void main(String [] args)
    {
       Scanner in = new Scanner(System.in);
        int maxBins;
        double ratePerKg;
        double weight = 0;
        System.out.println(" Enter number of bins the truck can collect. ");
        maxBins = in.nextInt();
        Boolean t = false;


        System.out.println("Enter the cost per kilo of rubbish");
        ratePerKg= in.nextDouble();

        RefuseTruck ob1 = new RefuseTruck(maxBins,ratePerKg);

        for(int i = 0;i < maxBins; i++)
        {
            System.out.println("Enter the weight for  bin : " + (i+1));
            weight = in.nextDouble();
            while(weight > 100)
            {
                    //inc declined
                    ob1.addDecline();
                    System.out.println("Bin is over the 100Kg weight - Collection declined");
                    System.out.println("Enter the weight for  bin : " + (i + 1));
                    weight = in.nextDouble();
                   // ob1.collectBin(weight);
             }

                ob1.collectBin(weight);



        }
            System.out.println(ob1.toString());


        }

    }

