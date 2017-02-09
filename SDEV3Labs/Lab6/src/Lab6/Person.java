package Lab6;

/**
 * Created by x00112730 on 10/10/2014.
 */
public class Person {
    //Member variables
    private String name;

    //Constructor
    public Person(String nameIn)
    {
        name = nameIn;
    }

    //Getter Method
    public String getName()
    {
        return name;
    }

    //Setter Method
    public void setName(String nameIn)
    {
        name = nameIn;
    }

    //Print Method
    public void print()
    {
        System.out.println("The name is : " + name);
    }
}
