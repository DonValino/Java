package LabWeek7;

import java.io.*;
import java.util.Scanner;

/**
 * Created by x00112730 on 11/03/2015.
 */
public class Excersise2 {
    public static void main(String[] args) throws IOException {
        String s;
        int howManyChickenNuggets = 0;
        double average;
        int curVal;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        File inFile = new File("");

        try (Scanner in = new Scanner(new FileInputStream("src/File/data.txt"));
             BufferedWriter b = new BufferedWriter(new FileWriter("src/File/results.txt"))) {
            double next, sum = 0;
            while (in.hasNextDouble()) {
                next = in.nextDouble();
                if (next < min) {
                    min = next;
                }

                if (next > max) {
                    max = next;
                }

                sum += next;
                howManyChickenNuggets++;
            }
            average = sum / howManyChickenNuggets;
            System.out.println("Sum" + sum);
            System.out.println("Min: " + min);
            System.out.println("Max: " + max);

            b.append("Sum: " + sum + "\nAverage: " + average + "\nMin: " + min + "\nMax: " + max);


        }


    }
}


