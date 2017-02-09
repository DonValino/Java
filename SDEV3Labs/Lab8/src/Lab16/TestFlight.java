package Lab16;

/**
 * Created by x00112730 on 14/11/2014.
 */
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
public class TestFlight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random ran = new Random();
        int capacity = 0;
        double duration = 0;
        int numberOfPassenger = 0;
        String name = "";
        int age = 0;
        boolean thereIsntAnError = false;


        Flight[] plane = new Flight[2];


            for (int i = 0; i < plane.length; i++) {
                 while (!thereIsntAnError) {
                     try {
                         System.out.print("Enter The Capacity of the flight" + (i + 1) + ":");
                         capacity = in.nextInt();

                         thereIsntAnError = true;
                     } catch (InputMismatchException nin) {
                         System.out.println("Data entry error - Please retry");
                         in.nextLine();
                     }
                 }
                thereIsntAnError = false;

                while(!thereIsntAnError) {
                    try {
                        System.out.print("Enter the duration of the flight: ");
                        duration = in.nextDouble();
                        thereIsntAnError = true;
                    } catch (InputMismatchException nin1) {
                        System.out.println("Data entry error - Please retry");
                        in.nextLine();
                    }
                }
                thereIsntAnError = false;
                in.nextLine();

                    plane[i] = new Flight(capacity, duration);
                    numberOfPassenger = 1 + ran.nextInt(2);


                    for (int s = 0; s < numberOfPassenger; s++) {
                        while(!thereIsntAnError) {
                            try {
                                System.out.print("Enter the name for passenger " + (s + 1) + ":");
                                name = in.nextLine();
                                thereIsntAnError = true;
                            } catch (IllegalArgumentException nin2) {
                                System.out.println("Data entry error - Please retry");
                                in.nextLine();
                            }
                        }
                        thereIsntAnError = false;
                        while (!thereIsntAnError) {
                            try {
                                System.out.print("Enter the age for passenger " + (s + 1) + ":");
                                age = in.nextInt();
                                thereIsntAnError = true;
                            } catch (InputMismatchException nin3) {
                                System.out.println("Data entry error - Please retry");
                                in.nextLine();
                                thereIsntAnError = false;
                            }
                        }
                        in.nextLine();
                        Flight.Passenger p = plane[i].new Passenger(name, age);
                        plane[i].addPassenger(p);
                        thereIsntAnError = false;
                    }

            }

        for(int i = 0;i < plane.length;i++) {
            System.out.println("Passenger List for Flight Number: " + (i+1));
            plane[i].print();
            System.out.println("Number of seats available " + plane[i].calcSeatLeft());
            System.out.println(plane[i].oldestPassenger() + " on flight number: " + (i+1));

        }




    }
}
