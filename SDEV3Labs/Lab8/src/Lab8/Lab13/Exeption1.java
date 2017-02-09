package Lab8.Lab13;

/**
 * Created by x00112730 on 04/11/2014.
 */
import java.util.*;
public class Exeption1 {
    public static void main(String args[]) {
        //Member Variables
        Scanner in = new Scanner(System.in);
           int a = 0;
           int b = 0;
            int divide = 0;
            boolean n = false;

        while (!n) {
            try {
                System.out.println("Enter number 1: ");
                a = in.nextInt();
                System.out.println("Enter number 2: ");
                b = in.nextInt();
                divide = b/a;
                n = true;
            } catch (InputMismatchException i) {
                System.out.println("Invalid integer entered. Please try again");
                i.printStackTrace();
                in.nextLine();
            } finally {
                System.out.println(b + " goes into " + a + " this many times: " + divide);
            }
        }




    }

}
