package Lab16;

import java.util.ArrayList;

/**
 * Created by x00112730 on 14/11/2014.
 */
public class Flight {
    //Member Variables
    private int capacity;
    private double duration;
    private int indexOldest = 0;
    private int flightNumber;

    ArrayList<Passenger> list = new ArrayList<Passenger>();

    //Constructor
    public Flight(int capacityIn,double durationIn)
    {
        capacity = capacityIn;
        duration = durationIn;
        flightNumber++;
    }

    //Method
    public void addPassenger(Passenger p)
    {
        list.add(p);
    }
    //print()
    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + ", " + list.get(i).age);

        }
    }

    //Method
    public int calcSeatLeft()
    {
        int amountLeft = 0;
        for (int i = 0; i < list.size(); i++) {
            amountLeft = capacity - list.size();
        }
        return amountLeft;
    }

    //Method
    public String oldestPassenger()
    {
        int max = Integer.MIN_VALUE;
        String oldest="";

        for (int i = 0; i < list.size(); i++) {
            if(max < list.get(i).age)
            {
                max = list.get(i).age;
                indexOldest = i;
            }

        }
        oldest = "Oldest Person is: " + list.get(indexOldest).name + " age: " +max;
        return oldest;
    }

    //Inner Class Passenger
    public class Passenger
    {
        //Member Variables
        private String name;
        private int age;

        //Constructor
        public Passenger(String nameIn,int ageIn)
        {
            name = nameIn;
            age = ageIn;
        }

    }
}
