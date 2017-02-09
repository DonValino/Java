/**
 * Created by X00108966 on 04/11/2014.
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class CatchEmAll {

    public static void main(String args[]) {

        int j = 0;
        int r = 0;
        int result = 0;
        boolean t = false;

        Scanner in = new Scanner(System.in);
        while(!t) {
            try {
                System.out.println("Enter the first number");
                j = in.nextInt();
                System.out.println("Enter the second number");
                r = in.nextInt();
                t = true;
            } catch (InputMismatchException o) {

                System.out.println("Invalid input detected");
                System.out.println("Please enter again");

            }
            result = j / r;
            System.out.println(j + " goes into " + r + result + " times");

        }
    }
}
