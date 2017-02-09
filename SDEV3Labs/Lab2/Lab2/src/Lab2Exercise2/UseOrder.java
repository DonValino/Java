package Lab2Exercise2;

/**
 * Created by x00112730 on 23/09/2014.
 */

import java.util.Scanner;
public class UseOrder {
    public static void main(String [] args)
    {
        //Instance Variables
        String name;
        int number;
        int qty;
        double price;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Customer name ");
        name = in.nextLine();

        System.out.println("Enter the Customer Number ");
        number = in.nextInt();

        System.out.println("Enter the quantity ordered ");
        qty = in.nextInt();

        System.out.println("Enter the unit price ");
        price = in.nextDouble();

        Order ob1 = new Order(name,number,qty,price);

        ob1.computeTotalPrice();
        ob1.print();

        System.out.println("");
        in.nextLine();

        System.out.println("Enter the Customer name ");
        name = in.nextLine();

        System.out.println("Enter the Customer Number ");
        number = in.nextInt();

        System.out.println("Enter the quantity ordered ");
        qty = in.nextInt();

        System.out.println("Enter the unit price ");
        price = in.nextDouble();

        ShippedOrder obb1 = new ShippedOrder(name,number,qty,price);
        obb1.computeTotalPrice();
        obb1.print();


    }
}
