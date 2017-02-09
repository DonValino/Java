package Exercise3;

/**
 * Created by JakeValino on 24/03/2015.
 */
public class Busy implements Runnable{

    @Override
    public void run() {
        System.out.println("Entering run method");
        for (int i = 0;i < 10; i++)
        {
                System.out.println("Busy...");
        }
        System.out.println("Leaving run method");
    }


}