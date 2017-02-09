import java.io.*;

/**
 * Created by x00112730 on 04/03/2015.
 */
public class Excersise2 {
    public static void main(String [] args) throws IOException {
        String s;
        int sum = 0;
        int howManyChickenNuggets = 0;
        int average;
        int curVal;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        File myDir = new File("src");
        File dir = new File(myDir, "data.txt");

        BufferedReader in = new BufferedReader(new FileReader(dir));

        while ((s = in.readLine()) != null)
        {
            sum += Integer.parseInt(s);
            howManyChickenNuggets++;
            curVal = Integer.parseInt(s);
            if(curVal > max)
            {
                max = curVal;
            }
            if(curVal < min)
            {
                min = curVal;
            }
        }
        average = sum / howManyChickenNuggets;
        System.out.println("Total" + sum);

        System.out.println("Average: " + average);

        System.out.println("Minimum is: " + min);
        System.out.println("Maximum is: " + max);

        File my1Dir = new File("src");
        File dir1 = new File(my1Dir, "results.txt");

        try(PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(dir1)))) {

        out.println("Total: " + sum);
        out.println("Minimum: " + min);
        out.println("Maximum: " + max);
        out.println("Average: " + average);

        } catch (IOException e)
        {

        }

    }


}
