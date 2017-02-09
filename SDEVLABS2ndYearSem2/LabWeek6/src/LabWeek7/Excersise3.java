package LabWeek7;

import java.io.*;
import java.util.Scanner;

/**
 * Created by x00112730 on 11/03/2015.
 */
public class Excersise3 {
    public static void main(String[] args) throws IOException {

        try(FileReader fileReader = new FileReader("src/File/song");
            FileWriter fileWriter = new FileWriter("src/File/lyrics")){
            int data;

            while ((data = fileReader.read()) != -1){
                fileWriter.write(data);
            }

        } catch (IOException e)
        {
            System.out.println("Error message: " + e.getMessage());
        }

        try (Scanner in = new Scanner(new FileInputStream("src/File/lyrics")))
        {
            String next = "",s = "";
            while (in.hasNext())
            {
                next = in.next();
                s += " " + next;
            }
            System.out.println("Song: " + s);

        }
    }


}
