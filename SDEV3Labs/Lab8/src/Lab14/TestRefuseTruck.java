import java.util.InputMismatchException;
import java.util.Scanner;


public class TestRefuseTruck {
	public static void main(String args[]) 
	{
	// Declare instance variables
        int noBins=0;
        double refuseRatePerKilo = 0.0, binWeight =0.0;
        boolean result = false;
        boolean result1 = false;
        boolean result0 = false;
        boolean result3 = false;

        Scanner in = new Scanner(System.in);
        while (!result0) {
            try {
                while (!result) {
                    System.out.print("Enter number of bins the truck can collect:");
                    noBins = in.nextInt();
                    in.nextLine();
                    result = true;
                }
                while (!result1) {
                    System.out.print("Enter cost per kilo:");
                    refuseRatePerKilo = in.nextDouble();
                    result1 = true;
                    in.nextLine();
                }
                RefuseTruck truck1 = new RefuseTruck(noBins, refuseRatePerKilo);

                while (!result3) {
                    while (truck1.getMaxBins() > truck1.getNoOfBinsCollected()) {
                        System.out.print("Enter the weight for  bin " + (truck1.getNoOfBinsCollected() + 1) + " :");
                        binWeight = in.nextDouble();
                        truck1.collectBin(binWeight);
                        result3 = true;
                    }
                    truck1.printStats();
                }
                result0 = true;

            } catch (InputMismatchException i) {
                System.out.println("Error with Input");
                result = false;
            }
            in.nextLine();
        }


       
	}

}
