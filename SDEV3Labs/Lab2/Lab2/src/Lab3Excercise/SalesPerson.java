package Lab3Excercise;

/**
 * Created by x00112730 on 26/09/2014.
 */
public class SalesPerson extends Employee{
    //Instance Variables
    private double [] sales;

    public SalesPerson(String nameIn,int yearsIn,double salariesIn, int daysIn)
    {
        super(nameIn,yearsIn,salariesIn);
        sales = new double[daysIn];

    }

    //fillSales Method
    public void fillSales(int numDays, double amountSales)
    {
        sales[numDays] = amountSales;
    }

    //report() Method
    public void report()
    {

        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        double total = 0;
        int numdays = 0;

        super.report();
        for (int i = 0; i< sales.length; i++) {

            total += sales[i];

        }

        for(int i = 0; i < sales.length; i++) {

            if (sales[i] > max) {
                max = sales[i];
            }


            if (min > sales[i]) {
                min = sales[i];
            }
            if (sales[i] == 0) {
                numdays++;
            }
        }

        System.out.println("The total sale figure is " + total);
        System.out.println("The minimum sales is : " + min);
        System.out.println("The maximum sales is : " + max);
        System.out.println("The number of days with no sales per week is : " + numdays);


    }

}
