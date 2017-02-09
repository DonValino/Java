package Lab15;

import Lab8.Lab13.Exeption1;

/**
 * Created by x00112730 on 11/11/2014.
 */
public class BelowMinException extends Exception {
    public BelowMinException(String error)
    {
        super("Warning:" + error);
    }

}
