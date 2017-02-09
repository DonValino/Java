package Lab4Exercise2;

/**
 * Created by x00112730 on 30/09/2014.
 */

import java.util.Scanner;
public class PhoneBook {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Instance Variables
        int numFriends;
        String name;
        int number;
        boolean found = false;
        String name1 = "";

        System.out.println("Enter the number of friends in your phone book");
        numFriends = in.nextInt();
        in.nextLine();
        Friend[] array = new Friend[numFriends];


        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the name : ");
            name = in.nextLine();

            System.out.println("Enter the number : ");
            number = in.nextInt();
            in.nextLine();
            array[i] = new Friend(name, number);

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }





        while (!found) {
            System.out.println("Please enter the name of the person whose number you wish to update:");
            name1 = in.nextLine();
            for (int i = 0; i < array.length; i++) {
                if (name1.equalsIgnoreCase(array[i].getName())) {
                    System.out.println("Please enter the new phone number");
                    number = in.nextInt();
                    in.nextLine();
                    array[i] = new Friend(name1, number);
                    found = true;
                }
                else
                {
                    System.out.println("Name not found");
                }

            }
        }

        for(int i = 0; i < array.length; i++ )
        {
            System.out.println(array[i].toString());
        }







    }

}
