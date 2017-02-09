package Lab2Exercise1;

/**
 * Created by x00112730 on 23/09/2014.
 */
public class Novel extends Book{
    //Instance Variable
    private String genre;

    //Constructor
    public Novel(String titleIn,int pageIn,String genreIn)
    {
        super(titleIn,pageIn);
        genre = genreIn;
    }

    //Setter Methods
    public void setGenre(String genreIn)
    {
        genre = genreIn;
    }

    //Setter Methods
    public void setTitle(String titleIn)
    {
        super.setTitle(titleIn);
    }

    //Setter Methods
    public void setNumOfPages(int pageIn)
    {
        super.setNumOfPage(pageIn);
    }

    //Getter Method
    public String getGenre()
    {
        return genre;
    }

    //Get Method
    public int getNumOfPage()
    {
        return super.getNumOfPage();
    }

    //get() methods
    public String getTitle()
    {
        return super.getTitle();
    }

    //Print Method
    public void print()
    {
        super.print();
        System.out.println("Genre is " + genre);
    }
}
