import java.io.IOException;
import java.io.*;
/**
 * Created by x00112730 on 04/03/2015.
 */
public class Excersise1 {
    public static void main(String [] args) throws IOException
    {
        String s;
        double sum = 0;
        File myDir = new File("src");
        File dir = new File(myDir,"numbers.txt");
        BufferedReader in = new BufferedReader(new FileReader(dir));

        while ((s = in.readLine()) != null)
        {
            sum += Double.parseDouble(s);
        }

        System.out.println(sum);
    }
}
