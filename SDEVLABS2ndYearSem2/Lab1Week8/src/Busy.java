/**
 * Created by JakeValino on 24/03/2015.
 */
public class Busy implements Runnable{
    @Override
    public void run() {
        System.out.println("\nEntering run method");
        for (int i = 0;i < 10; i++)
        {
            System.out.println("Busy...");
        }
        System.out.println("Leaving run method");
    }

    public static void main(String[] args) {
        System.out.println("Entering main Method");
        Thread threadA = new Thread(new Busy(),"Thread A");

        threadA.start();

        System.out.println("Leaving main method");
    }
}
