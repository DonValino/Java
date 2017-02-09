import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by JakeValino on 17/04/2015.
 */
public class HashMap {
    public static void main(String[] args) {
        Map<String,String> hm = new java.util.HashMap<String, String>();

        hm.put("render","to cause to be or to become; make");
        hm.put("immoderate","excedding just or reasonable limits");
        hm.put("foliaceous","pertaining to or consisting of leaves");
        hm.put("insubordinate","not submitting to authority; disobedient");
        hm.put("creek","a stream, book, or a minor tributary of river");

        Set set = hm.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext())
        {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println("The definition of "+ me.getKey() + ": " +hm.get(me.getKey()));
        }
        System.out.println("The definition of googol: " + hm.get("googol"));
    }
}
