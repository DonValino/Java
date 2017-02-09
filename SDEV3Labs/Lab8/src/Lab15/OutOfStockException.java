package Lab15;

/**
 * Created by x00112730 on 11/11/2014.
 */
public class OutOfStockException extends Exception {
    public OutOfStockException(String error)
    {
        super("Warning:" + error);
    }
}
