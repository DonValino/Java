package Lab3Excercise;

/**
 * Created by x00112730 on 26/09/2014.
 */
public class Employee {

    //Instance Variables
    private String name;
    private int years;
    private double salary;

    //Default Constructor
    public Employee()
    {
        name = "";
        years = 0;
        salary = 0;
    }

    //Overloaded Constructor
    public Employee (String nameIn, int yearsIn, double salaryIn)
    {
        name = nameIn;
        years = yearsIn;
        salary = salaryIn;
    }

    public void report()
    {
        System.out.println("Employee: " + name);
        System.out.println("        Name " + name);
        System.out.println("        Years " + years);
        System.out.println("        Salary " + salary);
    }

}
