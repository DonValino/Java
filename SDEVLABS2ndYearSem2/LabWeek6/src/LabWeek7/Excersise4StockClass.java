package LabWeek7;

import java.io.Serializable;

/**
 * Created by x00112730 on 11/03/2015.
 */
public class Excersise4StockClass implements Serializable {
    //instance variable
    private int idNumber;
    private String description;
    private int qty;

    public Excersise4StockClass(int id,String des,int q)
    {
        idNumber = id;
        description = des;
        qty = q;
    }

    public String toString()
    {
        return "ID Number: " + idNumber + "\nDescription: " + description + "\nQuantity: " + qty;
    }


}
