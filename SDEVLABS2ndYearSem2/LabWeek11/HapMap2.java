import java.util.*;
import java.util.HashMap;

/**
 * Created by JakeValino on 21/04/2015.
 */
public class HapMap2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int key = 0;
        int value = 0;
        do {
            System.out.println("Enter Value");
            key = in.nextInt();
            try {


                 value = hm.get(key);
            }catch (NullPointerException e)
            {
                value = 0;
            }
            if (key != -1) {
                hm.put(key, (value += 1));
            }
        }while (key != -1 && key >= 0);

        printValues(hm);
    }

    public static void printValues(Map<Integer,Integer> hm)
    {
        Set set = hm.entrySet();
        Iterator i = set.iterator();

        do {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println("The number " + me.getKey() + " occurs " + me.getValue() + " times");
        }while (i.hasNext());
    }

}
