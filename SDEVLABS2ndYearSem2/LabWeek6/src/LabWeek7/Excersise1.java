package LabWeek7;

import java.io.*;
import java.util.Scanner;

/**
 * Created by x00112730 on 11/03/2015.
 */
public class Excersise1 {
    public static void main(String [] args) throws IOException
    {

        try(Scanner in = new Scanner(new FileInputStream("src/File/numbers.txt")))
        {
            double next, sum = 0;
            while (in.hasNextDouble())
            {
                next = in.nextDouble();
                sum += next;

            }
            System.out.println(sum);
        }
    }
}
