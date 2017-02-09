package Lab4;

/**
 * Created by x00112730 on 30/09/2014.
 */
import java.util.Scanner;
public class TestTaxPayer {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //Instance Variables
        int numPayer;

        System.out.println("Enter the number of tax payers : ");
        numPayer = in.nextInt();
        int [] rsiNum = new int[numPayer];
        double [] salaries = new double[numPayer];
        TaxPayer [] array = new TaxPayer[numPayer];

        //For Loop to ask users for values
        for(int i = 0; i < rsiNum.length;i++ )
        {
            System.out.println("Enter the rsi numbers for tax payer " + (i + 1));
            rsiNum[i] = in.nextInt();
            System.out.println("Enter the salary for tax payer " + (i + 1));
            salaries[i]= in.nextDouble();
        }

        array[0]= new TaxPayer(1001,35000);
        array[1]= new TaxPayer(2001,56000);
        array[2]= new TaxPayer(3001,60000);

        for(int i = 0; i < array.length; i++)
        {
            System.out.println("RSI no = " + array[i].getRsiNo());
            System.out.println("Gross Salary = " + array[i].getGrossIncome());
        }








    }

}
