package Lab8;

/**
 * Created by x00112730 on 17/10/2014.
 */
public interface IPayable {
    double lowTaxRate = 23;
    double highTaxRate = 42;
    double vatRate = 23.5;

    public double getPaymentAmount();

}
