package Exercise2;

import java.io.IOException;

/**
 * Created by JakeValino on 24/03/2015.
 */
public class TestBusy {
    public static void main(String[] args) {
        System.out.println("Entering main Method");
        Thread threadA = new Thread(new Busy(),"Thread A");

        threadA.setDaemon(true);
        threadA.start();

        try
        {
            Thread.sleep(70);
            threadA.interrupt();

        } catch (InterruptedException e)
        {

        }


        System.out.println("Leaving main method");
    }
}
