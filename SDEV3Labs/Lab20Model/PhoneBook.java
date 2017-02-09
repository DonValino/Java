package Lab20Model;

import java.util.ArrayList;

/**
 * Created by x00112730 on 02/12/2014.
 */
public class PhoneBook {
    //Member Variables
    private String owner;
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    //Constructor
    public PhoneBook(String o)
    {
        owner = o;
    }

    //addContact
    public void addContact(Contact c)
    {
        contactList.add(c);
    }

    //getContact()
    public Contact getContact(int i)
    {
        return contactList.get(i);
    }

    //getOwner
    public String getOwner()
    {
        return owner;
    }

    //getNumContact()
    public int  getNumContact()
    {
        return contactList.size();
    }

    //removeContact()
    public int removeContact(String name)
    {
        int num = 0;

        for (int i=0;i<contactList.size();i++)
        {
            if((name.equals(contactList.get(i).getName())))
            {
                contactList.remove(i);
                num++;
            }
        }
        return num;
    }

    //findContact()
    public int findContact(String n) {
        int returnValue = -1; // -1 if there is no match
        for (int i = 0; i < contactList.size(); i++) {
            if (n.equals(contactList.get(i).getName()))
                returnValue = i;
        }
        return returnValue;
    }

    public void changeContactNumber(String newnum,int num) {
                contactList.get(num).setPhoneNumber(newnum);

    }





}
