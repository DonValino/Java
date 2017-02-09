package Lab15;

/**
 * Created by x00112730 on 11/11/2014.
 */
public class TestStock {
    public static void main(String [] args)
    {
        StockItem ob1 = new StockItem("123","Shampoo",100,10,25);

        ob1.takeOnStock(80);
        ob1.issueStock(30);
        ob1.issueStock(20);
        System.out.println("Amount left in stock is: " + ob1.getInStock());
    }
}
