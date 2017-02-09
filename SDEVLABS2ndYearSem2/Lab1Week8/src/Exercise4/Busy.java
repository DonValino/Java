package Exercise4;

/**
 * Created by JakeValino on 24/03/2015.
 */
public class Busy implements Runnable{

    //Instance Variables
    private String name;

    //Constructor
    public Busy(String nameIn) {name = nameIn;}

    @Override
    public void run() {
        System.out.println("\nEntering run method");
        for (int i = 0;i < 10; i++)
        {
            try {
                Thread.sleep(100);
                System.out.println(name + " is Busy...");
            }catch (InterruptedException ii)
            {
                System.out.println(ii);
            }
        }
        System.out.println("Leaving run method");
    }

}
