import java.io.*;

/**
 * Created by x00112730 on 09/03/2015.
 */
public class TestLogOn {

    private final String FILENAME = "src/logon.dat";// write a car

    private void write() {
        Logon l1 = new Logon("User1", "Password1");
        Logon l2 = new Logon("User2", "Password2");
        try (FileOutputStream fo = new FileOutputStream(FILENAME);
             ObjectOutputStream oo = new ObjectOutputStream(
                     new BufferedOutputStream(fo))) {
            oo.writeObject(l1);
            System.out.println("Logon written:\t" + l1);
            oo.writeObject(l2);
            System.out.println("Logon written:\t" + l2);
        } catch (NotSerializableException e) // doesn't implement serializable
        {
            System.out.println(e);
        } catch (IOException e) // file output error
        {
            System.out.println(e);
        }
    }

    private void read() {
        Logon c;
        try (ObjectInputStream oi = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(FILENAME)))) {
            do {
                try {
                    c = (Logon) oi.readObject();
                    System.out.println("Logon read:\t" + c + "\t");
                } catch (EOFException e) {
                    System.out.println("EOF reached");
                    break;
                }
            } while (true);
        } catch (IOException e) // file input error
        {
            System.out.println(e);
        } catch (ClassNotFoundException e) // class not found in this
        // application
        {
            System.out.println(e);
        }
    }

    public static void main(String [] args)
    {
        TestLogOn c = new TestLogOn();
        c.write();

        c.read();
    }
}
