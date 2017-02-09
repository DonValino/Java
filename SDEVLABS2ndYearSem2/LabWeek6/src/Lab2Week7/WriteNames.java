package Lab2Week7;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by x00112730 on 13/03/2015.
 */
public class WriteNames {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Please select an option 1,2 or 3");
        int opt = in.nextInt();
        if(opt == 1)
        {
            runOne();
        }else if (opt == 2)
        {
            runTwo();
        }else if (opt == 3)
        {
            runThree();
        }else
        {
            System.out.println("Error, you must select between 1,2 or 3.");
        }
    }

    //static readFile Method
    public static String[] readFile() {
        String[] name = new String[5];
        int i = 0;
        try (Scanner in = new Scanner(new FileInputStream("src/Lab2Week7/names.txt"))) {
            String next = "", s = "";
            while (in.hasNextLine()) {

                next = in.nextLine();
                name[i] = next;
                i++;
            }

        } catch (IOException k) {

        }
        return name;
    }

    //runOne() Method
    public static void runOne()
    {
        String [] names1 = readFile();

            try (PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("src/Lab2Week7/optOne.txt")))) {
                for (int h = 0; h < names1.length;h++) {
                    System.out.println(names1[h]);
                    out.println(names1[h]);
                }


            } catch (IOException e) {

            }
    }


    //runTwo() Method
    public static void runTwo()
    {
        String [] names2 = readFile();
        int i = 0;



            try (PrintWriter out = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("src/Lab2Week7/optTwo.txt")))) {
                for (int h = 0; h < names2.length;h++) {
                    System.out.println(names2[h]);
                    out.println(names2[h]);
                    h++;
                }


            } catch (IOException e) {

            }

    }

    //runtThree() Method
    public static void runThree()
    {
        Scanner in = new Scanner(System.in);
        String [] name3 = new String[5];
        for (int g = 0; g < readFile().length;g++)
        {
            name3[g] = readFile()[g];
        }
        System.out.println("Please enter the name: ");
        String name = "";
        name = in.nextLine();

        for (int i = 0; i < name3.length;i++)
        {
            String n = name3[i];
            String str= name3[i];

            String criteria= " ";
            String [] strarr = str.split(criteria);

            for(int j = 0; j < strarr.length;j++) {

                if (name.equals(strarr[j]) || name.equals(name3[i])) {
                    try (PrintWriter out = new PrintWriter(
                            new BufferedWriter(
                                    new FileWriter("src/Lab2Week7/opt3.txt")))) {
                        out.println(n);

                    } catch (IOException e) {

                    }
                }
            }
        }

    }




}




