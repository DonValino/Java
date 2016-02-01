/**
 * Created by edoncva on 01/02/2016.
 */
public class TestVehicle {
    public static void main(String[] args) {
        ChevroletLacetti c = new ChevroletLacetti(077,"Blue",20000);
        System.out.println("The Price of this car is: " + c.getPrice());
        System.out.println("This car has " + c.getNumberOfDoors() + " doors");
        System.out.println("The colour of this car is: " + c.getColour());

    }
}
