package Lab3Excercise;

/**
 * Created by x00112730 on 26/09/2014.
 */
import java.util.Scanner;
public class TestSales {
    public static void main(String [] args)
    {
        double one = 0;
        double two = 0;
        double three = 0;
        double four = 0;
        double five = 0;
        Scanner in = new Scanner(System.in);
        SalesPerson ob1 = new SalesPerson("John Dixson",5,40000,5);
        for(int i = 0; i < 5; i++) {
            System.out.println("Enter amount of sales for sale transaction " + (i + 1));
            one = in.nextInt();
            ob1.fillSales(i, one);
        }



        ob1.report();


    }
}
