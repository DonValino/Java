package LabWeek7;

import java.io.*;

/**
 * Created by x00112730 on 11/03/2015.
 */
public class Excersise4ReadFile {
    private void read() {
         Excersise4StockClass c;
        try (ObjectInputStream oi = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("src/File/Stock.dat")))) {
            do {
                try {
                    c = (Excersise4StockClass) oi.readObject();
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
    public static void main(String[] args) {
        Excersise4ReadFile r = new Excersise4ReadFile();
        r.read();
    }
}
