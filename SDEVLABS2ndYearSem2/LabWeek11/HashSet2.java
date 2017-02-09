import javax.xml.soap.SAAJMetaFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.HashSet;

/**
 * Created by JakeValino on 21/04/2015.
 */
public class HashSet2 {

    public static void main(String[] args) {


        Set<String> setNames = new HashSet<String>(500);

        try (Scanner input = new Scanner(
                new FileInputStream("src/names.txt"))) {
            String line = null;

            while (input.hasNextLine())
            {
                line = input.nextLine();
                setNames.add(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        Iterator i = setNames.iterator();
        System.out.println("");
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
