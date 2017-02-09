package Lab2Exercise1;

/**
 * Created by x00112730 on 23/09/2014.
 */
public class Book {
    //Variables
    private String title;
    private int numOfPage;

    //Constructor
    public Book(String titleIn, int numOfPageIn) {
        title = titleIn;
        numOfPage = numOfPageIn;
    }

    //Get Method
    public String getTitle() {
        return title;
    }

    //Get Method
    public int getNumOfPage() {
        return numOfPage;
    }

    //Setter Method
    public void setTitle(String titleIn) {
        title = titleIn;
    }

    //Setter Method
    public void setNumOfPage(int pageIn) {
        numOfPage = pageIn;
    }

    //Print Method
    public void print() {
        System.out.println("The title is " + title);
        System.out.println("The number of pages is " + numOfPage);
    }
}


