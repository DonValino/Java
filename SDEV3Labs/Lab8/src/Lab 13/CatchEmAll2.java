import java.util.Scanner;



public class CatchEmAll2{
  public static void main(String args[]){
    Scanner in = new Scanner (System.in);
    int array[] = {10,11,12,13,14};
    try{
      System.out.println("Which Index would you like?");
      int index = in.nextInt();
      System.out.println("Answer: " + array[index]);
    }
    
    catch(IndexOutOfBoundsException s){
      System.out.println("Index is out of bounds");
      s.printStackTrace();
    }
  }
}
