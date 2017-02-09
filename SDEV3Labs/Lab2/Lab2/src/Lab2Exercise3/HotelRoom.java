package Lab2Exercise3;

/**
 * Created by x00112730 on 23/09/2014.
 */
public class HotelRoom {
    //Instance Variables
    private int roomNumber;
    protected double nightlyRentalRate;

    //Getter Method
    public int getRoomNumber()
    {
        return roomNumber;
    }

    //Getter Method
    public double getNightlyRate()
    {
        return nightlyRentalRate;
    }

    //Setter Method
    public void setRoomNumber(int in)
    {
        roomNumber = in;
    }


    //Set Rate Method
    public void setRate()
    {
        if(roomNumber <= 299)
        {
            nightlyRentalRate = 70;
        }
        else
        {
            nightlyRentalRate = 90;
        }
    }
    //Constructor
    public HotelRoom(int roomNum)
    {
        roomNumber = roomNum;
        setRate();
    }

    //Print Method
    public void print()
    {
        System.out.println("The cost per night of the room is " + nightlyRentalRate);
    }




}
