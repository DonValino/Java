package Exercise2;

import java.io.IOException;

/**
 * Created by JakeValino on 24/03/2015.
 */
public class Busy implements Runnable{
    @Override
    public void run() {
        System.out.println("Entering run method");
       for (int i =0;i < 10;i++)
        {
            try {

                System.out.println("Busy...");
                Thread.sleep(10);

            } catch (InterruptedException e) {
                System.out.println(e);
            }

        }
        System.out.println("Leaving Run Method");
    }

}
