package Lab11;

/**
 * Created by x00112730 on 28/10/2014.
 */
import java.util.Scanner;
public class TestMemory {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        //Member Variables
        String man = "";
        int memSize = 0;
        int numMemModule = 0;
        int [] num;

        System.out.print("Enter manufacturer : ");
        man = in.next();

        System.out.print("Enter memory size : ");
        memSize = in.nextInt();

        System.out.print("Enter the number of memory modules : ");
        numMemModule = in.nextInt();
        num = new int[numMemModule];


        MotherBoard ob1 = new MotherBoard(man,memSize,num);
        System.out.println(ob1.toString());


    }
}
