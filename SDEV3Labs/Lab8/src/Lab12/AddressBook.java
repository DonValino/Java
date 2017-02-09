package Lab12;

/**
 * Created by x00112730 on 31/10/2014.
 */
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class AddressBook {
    Random ran = new Random();
    Scanner in = new Scanner(System.in);

    //Member Variables
   private String ownerAddressBook;
    private int totalNumberOfContacts;
    private static int total;
    private ArrayList<Contact> listOfContact;


    //Constructor
    public AddressBook(String ownerAddressBookIn)
    {
        ownerAddressBook = ownerAddressBookIn;
        fillList();

    }

    public static int totalNumBerOfContacts()
    {
        return total;
    }

    //fillList()
    public void fillList()
    {
        totalNumberOfContacts = ran.nextInt(5)+1;
        String [] number = new String[totalNumberOfContacts];
        String [] name = new String[totalNumberOfContacts];
        String [] gender = new String[totalNumberOfContacts];
        listOfContact = new ArrayList<Contact>();
        total = totalNumberOfContacts;
        for(int i = 0; i < totalNumberOfContacts;i++) {
            System.out.println("Enter name for Contact " + (i+1));
            name[i] = in.nextLine();
            System.out.println("Enter gender for contact " + (i+1));
            gender[i] = in.nextLine();
            System.out.println("Enter mobile for contact " + (i+1));
            number[i] = in.nextLine();

            listOfContact.add(new Contact(name[i],gender[i],number[i]));
        }

    }

    //disPlayContacts()
    public String toString()
    {
        String content = "";
        for(int i = 0; i < listOfContact.size();i++)
        {
            content += "Address book belongs to " + listOfContact.get(i).getGender() + ", " + listOfContact.get(i).getGender()+ " , " + listOfContact.get(i).getMobile();
        }
        return content;
    }

    //return male
    public int calcMale()
    {
        int count = 0;
        for(int i = 0; i < listOfContact.size();i++)
        {
            if(listOfContact.get(i).equals("m"))
            {
                count ++;
            }
        }
        return count;
    }

    //Inner Class
    class Contact
    {
        //Member Variables
        private String name;
        private String gender;
        private String mobile;

        //Constructor
        public Contact(String nameIn,String genderIn,String mobileIn)
        {
            name = nameIn;
            gender = genderIn;
            mobile = mobileIn;
        }

        //Getters
        public String getName()
        {
            return name;
        }

        //Getter
        public String getGender()
        {
            return gender;
        }

        //Getter
        public String getMobile()
        {
            return mobile;
        }
    }
}
