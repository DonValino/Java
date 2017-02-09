package Lab12;

/**
 * Created by x00112730 on 31/10/2014.
 */
import java.util.Scanner;
public class TestAddress {
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        AddressBook [] ob1 = new AddressBook[3];
        String name = "";
        for(int i = 0; i < ob1.length;i++)
        {
            System.out.println("Enter the owner for address book " + (i+1));
            name = in.next();

            ob1[i] = new AddressBook(name);
        }

        for(int i = 0; i < ob1.length;i++) {
            System.out.println(ob1[i].toString());
            System.out.println("Number of male friends are: " + ob1[i].calcMale());
        }
        System.out.println("Total Contacts: " + AddressBook.totalNumBerOfContacts());
    }
}
