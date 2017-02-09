package Lab8.ArrayList;

/**
 * Created by x00112730 on 29/10/2014.
 */
public class TestClub {
    public static void main(String []args)
    {
        //Creating an object of Class Club
        Club c = new Club();

        c.join(new Membership("David",2,2004)); //One way of using join();

        Membership m2 = new Membership("Michael",3,2004); //One way of using join();
        c.join(m2);//One way of using join();

        System.out.println("The club has :" + c.numberOfMembers());


    }
}
