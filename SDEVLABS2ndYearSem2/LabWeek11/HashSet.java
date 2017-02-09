import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by JakeValino on 17/04/2015.
 */
public class HashSet {
    //Instance Variables
    private String [] sampleString = {"red","red","blue","orange","cyan","indigo","blue","orange","black","pink","green","navy","emerald"};

    Set<String> sampleStringSet = new java.util.HashSet<String>(500);

    public void addString(String sampleStringIn)
    {
        sampleStringSet.add(sampleStringIn);
    }

    public void processString(String[] string)
    {
        for (String s : string)
        {
            if (!sampleStringSet.contains(s))
            {
                addString(s);
            }
        }
    }

    public Set<String> getSampleStringSet()
    {
        return sampleStringSet;
    }

    public String[] getSampleString()
    {
        return sampleString;
    }

    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.processString(s.getSampleString());
        System.out.println("The number of unique strings is: " + s.getSampleStringSet().size());
        Iterator i = s.getSampleStringSet().iterator();

        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
