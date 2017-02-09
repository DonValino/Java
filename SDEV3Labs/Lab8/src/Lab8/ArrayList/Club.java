package Lab8.ArrayList;

import java.util.ArrayList;

/**
 * Created by x00112730 on 29/10/2014.
 */
public class Club {
    //ArrayList
    private ArrayList<Membership> members;

    //Constructor
    public Club()
    {
        members = new ArrayList<Membership>();
    }

    //join()
    public void join(Membership m)
    {
        members.add(m); //This method takes an object reference :)
    }

    //numberOfMethods()
    public int numberOfMembers()
    {
        return members.size();
    }


}
