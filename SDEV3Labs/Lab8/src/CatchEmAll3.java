import java.util.InputMismatchException;
import java.util.Scanner;



public class CatchEmAll3{
  public static void main(String args[]){
    
    Scanner in = new Scanner (System.in);
    
    int [] a = new int[9];
    boolean genuine = false;
    int i = 0;
    
   int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    
    while(i<a.length){
      try {

              System.out.println("Enter Number: " + (i + 1));
              a[i] = in.nextInt();
              i++;
              if (min < a[i]) {
                  min = a[i];
              }
              if (max > a[i]) {
                  max = a[i];
              }




      }
      catch (InputMismatchException o) {

          System.out.println("Invalid input detected");
          i = a[i];
          in.nextLine();

      }


    }
      System.out.println("The largest number is: " + max);
      System.out.println("The smallest number is: " + min);

  }
}