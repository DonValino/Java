package Lab2Exercise3;

/**
 * Created by x00112730 on 23/09/2014.
 */
public class Suite extends HotelRoom {
   //Constructor
    public Suite(int num)
    {
        super(num);
    }
    //Over Riding setRate Method
    public void setRate()
    {
        super.setRate();
        nightlyRentalRate += 40;
    }



}
