package Lab2Exercise3;

/**
 * Created by x00112730 on 23/09/2014.
 */
public class UseHotelRoom {
    public static void main(String[] args)
    {
        HotelRoom ob1 = new HotelRoom(300);
        ob1.print();
        System.out.println("Room number " + ob1.getRoomNumber() + " cost " + ob1.getNightlyRate());
    }

}
