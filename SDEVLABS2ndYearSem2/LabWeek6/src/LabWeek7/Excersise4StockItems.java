package LabWeek7;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by x00112730 on 11/03/2015.
 */
public class Excersise4StockItems {
    private  ArrayList<Excersise4StockClass> stock1 = new ArrayList<>();

    public void add() {
        Excersise4StockClass s = new Excersise4StockClass(1, "Hammer", 10);
        stock1.add(s);
        stock1.add(new Excersise4StockClass(2, "Tools", 10));
        stock1.add(new Excersise4StockClass(3, "Knife", 20));
        stock1.add(new Excersise4StockClass(4, "Spoon", 10));
    }

    private void write() {
        try (FileOutputStream fo = new FileOutputStream("src/File/Stock.dat");
             ObjectOutputStream oo = new ObjectOutputStream(
                     new BufferedOutputStream(fo))) {

            for (int i = 0; i < stock1.size(); i++) {
                oo.writeObject(stock1.get(i));
            }
        } catch (NotSerializableException e) // doesn't implement serializable
        {
            System.out.println(e);
        } catch (IOException e) // file output error
        {
            System.out.println(e);
        }
    }




    public static void main(String[] args) {
        Excersise4StockItems s = new Excersise4StockItems();
        s.add();
        s.write();
    }


}
