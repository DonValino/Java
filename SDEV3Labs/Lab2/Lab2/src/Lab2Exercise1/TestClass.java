package Lab2Exercise1;

/**
 * Created by x00112730 on 23/09/2014.
 */
import java.util.Scanner;
public class TestClass
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String title;
        int numOfPage;
        int gradeLevel;
        String genre;

        System.out.println("Enter the title" );
        title = in.nextLine();

        System.out.println("Enter the grade level" );
        gradeLevel = in.nextInt();

        System.out.println("Enter the Number of pages" );
        numOfPage = in.nextInt();
        TextBook ob1 = new TextBook(title,numOfPage,gradeLevel);



        Novel obb1 = new Novel("Book and Prejudice",300,"Romance");

        ob1.print();
        System.out.println("");
        obb1.print();


    }
}