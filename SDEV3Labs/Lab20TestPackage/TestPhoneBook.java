package Lab20TestPackage;

import Lab20Model.Contact;
import Lab20Model.PhoneBook;

/**
 * Created by x00112730 on 02/12/2014.
 */
public class TestPhoneBook {
    public static void main(String [] args)
    {
        PhoneBook p = new PhoneBook("John");
        Contact c1 = new Contact("Mary","1 Here rd","12345","a@b.com");
        Contact c2 = new Contact("John","2 Here rd","17878","c@d.com");
        Contact c3 = new Contact("Jim","3 Here rd","12925","f@g.com");
        p.addContact(c1);
        p.addContact(c2);
        p.addContact(c3);

        gui.PhoneBookGUISk pb = new gui.PhoneBookGUISk(p);


    }
}
