package Lab8;

/**
 * Created by x00112730 on 17/10/2014.
 */
public class TestData {
    public static void main(String [] args)
    {
        IPayable [] pList = new IPayable[5];

        double total = 0;

        pList[0] = new Invoice("Printer",01234,375,2);
        pList[1] = new Invoice("Ink Cartridges",56789,79.95,4);
        pList[2] = new HourlyEmployee("John","Smith","6578431N",30,60);
        pList[3] = new HourlyEmployee("Lisa","Kelly","9865431M",12,20);
        pList[4] = new HourlyEmployee("Mary","Reilly","9875431M",8,20);

        for(int i = 0; i < pList.length;i++)
        {
            System.out.println(pList[i].toString());
            System.out.println("Amount due : " + pList[i].getPaymentAmount());
        }


        System.out.println("\nThe number of Employees processed is : " + Employee.getSum());
        System.out.println("The number of invoices processed is : " + Invoice.getSum());
        System.out.printf("The total amount of VAT paid is : €%,.2f%n",Invoice.getTotalTax());
        for(int i = 0; i < pList.length;i++)
        {
            if(pList[i] instanceof HourlyEmployee)
            {
                HourlyEmployee h = (HourlyEmployee) pList[i];
                total = total + h.getTotalTax();

            }
        }
            System.out.printf("The total amount of tax paid is : €%,.2f%n",total);




    }
}
