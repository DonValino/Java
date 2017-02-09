package Lab2Exercise1;

/**
 * Created by x00112730 on 23/09/2014.
 */
public class TextBook extends Book {
    //Instancde Variables
    private int gradeLevel;

    //Constructor
    public TextBook(String titleIn,int numOfPageIn,int gradeLevelIn)
    {
        super(titleIn,numOfPageIn);
        gradeLevel = gradeLevelIn;
    }

    //get() methods
    public String getTitle()
    {
        return super.getTitle();
    }

    //Get Method
    public int getNumOfPage()
    {
        return super.getNumOfPage();
    }
    //Get Method
    public int getGradeLevel()
    {
        return gradeLevel;
    }

    //Setter Method
    public void setTitle(String titleIn)
    {
        super.setTitle(titleIn);
    }

    //Setter Method
    public void setNumOfPage(int pageIn)
    {
        super.setNumOfPage(pageIn);
    }

    //Print Method
    public void print()
    {
        super.print();
        System.out.println("Grade Level is " + gradeLevel);
    }
}
