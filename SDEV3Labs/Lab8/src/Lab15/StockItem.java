package Lab15;

/**
 * Created by x00112730 on 11/11/2014.
 */
public class StockItem {


    //Member Variables
    private String storeId;
    private String description;
    private int maximum;
    private int minimum;
    private int inStock;

    //Overloaded Constructor
    public StockItem(String storeIdIn, String descriptionIn, int maximumIn, int minimumIn, int inStockIn){
        storeId = storeIdIn;
        description = descriptionIn;
        maximum = maximumIn;
        minimum = minimumIn;
        inStock = inStockIn;
    }

    //Default Constructor
    public StockItem() {
        storeId = "";
        description = "";
        maximum = 0;
        minimum = 0;
        inStock = 0;
    }


        //takeOnStock()
        public void takeOnStock ( int quantity)
        {
            try {
                int canitgo = quantity + inStock;
                int max = maximum;
                if (isAboveMaximum(max, quantity,canitgo)) {
                    System.out.println("Quantity is added :)");
                    inStock += quantity;
                }
            }
            catch (OverMaxException o)
            {
                System.out.println(o.getMessage());
            }
        }

        //issueStock()
        public void issueStock(int quantity)
        {
            try
            {
                int canitgo = inStock - quantity;
                int stock = inStock;
                int min = minimum;
                if(isOutOfStock(canitgo,stock,quantity,min))
                {
                    if(quantity <= inStock) {
                        System.out.println("Stock deducted");
                        inStock -= quantity;
                    }
                }
            }
            catch (OutOfStockException o)
            {
                System.out.println(o.getMessage());
            }
            catch (BelowMinException b)
            {
                System.out.println(b.getMessage());
                inStock -= quantity;
            }
        }


       //takeOnStaff Method
    public static boolean isAboveMaximum(int max, int quantityIn,int canitgo1In) throws OverMaxException {
        boolean valid = true;
        if (canitgo1In > max) {
            throw new OverMaxException(" Stock is over the maximum allowed limit.Please correct it Thank YOUUUU.");
        }
        return valid;
    }

    //issueStock() method Zero
    public static boolean isOutOfStock(int canitgoIn,int stockIn,int quantityIn,int minIn) throws OutOfStockException,BelowMinException{
        boolean valid = true;
        if(canitgoIn == 0 || quantityIn > stockIn)
        {
            throw new OutOfStockException(" Out of stock. Please correct it Thank YOUUUU.");
        }
        else if(canitgoIn < minIn)
        {
            throw new BelowMinException(" Stock below acceptable minimum level .Please fix ehhh :)!!!!");
        }
        return valid;
    }


    //Getter Method for inStock variable
    public int getInStock()
    {
        return inStock;
    }


}
