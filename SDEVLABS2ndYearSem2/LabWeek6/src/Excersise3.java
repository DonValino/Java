import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

/**
 * Created by x00112730 on 04/03/2015.
 */
public class Excersise3 {
    private static final String songOriginalFile = "src/song.txt";
    private static final String songCopyFile = "src/lyrics.txt";

    public static void main(String [] args) throws IOException
    {
        try(FileReader fileReader = new FileReader(songOriginalFile);
        FileWriter fileWriter = new FileWriter(songCopyFile)){
            int data;

            while ((data = fileReader.read()) != -1){
                fileWriter.write(data);
            }

        } catch (IOException e)
        {
            System.out.println("Error message: " + e.getMessage());
        }



        String s;
        BufferedReader in = new BufferedReader(new FileReader("src/lyrics.txt"));
        while((s = in.readLine()) != null)
        {
            System.out.println(s);
        }

        in.close();



    }
}
