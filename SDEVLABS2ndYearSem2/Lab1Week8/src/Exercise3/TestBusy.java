package Exercise3;

/**
 * Created by JakeValino on 24/03/2015.
 */
public class TestBusy {
    public static void main(String[] args) {
        System.out.println("Entering main Method");
        Thread threadA = new Thread(new Busy(),"Thread A");
        threadA.setPriority(Thread.MAX_PRIORITY);
        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException ii)
        {

        }


        System.out.println("Leaving main method");
    }
}
