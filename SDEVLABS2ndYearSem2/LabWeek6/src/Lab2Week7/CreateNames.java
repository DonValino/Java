package Lab2Week7;

import java.io.*;
import java.util.Scanner;

/**
 * Created by x00112730 on 13/03/2015.
 */
public class CreateNames {
    public static void main(String[] args) throws IOException {

        try(PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("src/Lab2Week7/names.txt")))) {

            out.println("Jake ValinO");
            out.println("Gareth Quirke");
            out.println("Graham Timmins");
            out.println("Shane Preston");
            out.println("John Smith");


        } catch (IOException e)
        {

        }

        try (Scanner in = new Scanner(new FileInputStream("src/Lab2Week7/names.txt")))
        {
            String next = "",s = "";
            while (in.hasNext())
            {
                next = in.next();
                s += " " + next;
            }
            System.out.println("Name: " + s);

        }
    }
}
