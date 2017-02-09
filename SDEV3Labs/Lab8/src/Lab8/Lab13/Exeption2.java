package Lab8.Lab13;

/**
 * Created by x00112730 on 04/11/2014.
 */
import java.util.Scanner;
public class Exeption2 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int array[] = { 10, 11, 12, 13, 14 } ;

        try {
            System.out.print("Which index would you like?");
            int index = in.nextInt();
            System.out.println("Answer: " + array[index]);
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("Error, Index is out of bound");
            e.printStackTrace();
        }

    }
}
