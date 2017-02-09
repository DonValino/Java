package Lab2Sem2;

/**
 * Created by Jake on 03/02/15.
 */
public class TestContacts {
    public static void main(String [] args)
    {
        Contacts c = new Contacts();
        c.openDB();
        c.dropTables();
        c.buildMContactTable();
        c.add(5,"Timmy","34 Sommerville Heights",012334577,"tim@c.com");
        c.showDB();
        c.queryDB();
    }
}
