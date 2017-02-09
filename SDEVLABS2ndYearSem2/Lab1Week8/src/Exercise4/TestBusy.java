package Exercise4;

/**
 * Created by JakeValino on 24/03/2015.
 */
public class TestBusy {
    public static void main(String[] args) {
        System.out.println("Entering main Method");

        Thread harry = new Thread(new Busy("Harry"),"Thread A");
        harry.setPriority(Thread.MAX_PRIORITY);
        harry.start();

        Thread janine = new Thread(new Busy("Janine"),"Thread B");

        try {
            harry.join();
            janine.start();
            janine.join();
        } catch (InterruptedException ii)
        {

        }
        System.out.println("Leaving main method");
    }
}
