package Lab20Model;

/**
 * Created by x00112730 on 02/12/2014.
 */
public class Contact {
    //Member Variables
    private String name,address,phoneNumber,email;

    //Constructor
    public Contact(String n,String ad,String ph,String em)
    {
        name = n;
        address = ad;
        phoneNumber = ph;
        email = em;
    }

    //Getter
    public String getName()
    {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    //Getter
    public String getAddress() {
        return address;
    }

    //Setter
    public void setAddress(String address) {
        this.address = address;
    }

    //Getter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    //Setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //Getter
    public String getEmail() {
        return email;
    }

    //Setter

    public void setEmail(String email) {
        this.email = email;
    }
}
