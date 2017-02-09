package Lab8.Lab13;

/**
 * Created by x00112730 on 04/11/2014.
 */
import java.util.*;
public class Exeption3 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int [] a = new int[9];
        boolean valid = false;
        int i = 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (!valid) {
            try {
                while (i < a.length) {
                    System.out.println("Enter number" + (i + 1));
                    a[i] = in.nextInt();
                    i++;
                    if (min > a[i]) {
                        min = a[i];
                    }
                    if (max < a[i]) {
                        max = a[i];
                    }
                }
                System.out.println("The largest number is: " + max);
                System.out.println("The smallest number is: " + min);
                valid = true;
            } catch (InputMismatchException ii) {
                System.out.println("Error in input, Please enter digits only");
                i += a[i];
                in.nextLine();
            }
        }
    }
}
