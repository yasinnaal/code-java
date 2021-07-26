// Import the Scanner class
import java.util.Scanner;
class GenerateRandom {
    public static void main( String args[] ) {
      int min = 50;
      int max = 100;

      Scanner int_min = new Scanner(System.in);  
      Scanner int_max = new Scanner(System.in);  

      System.out.println("Enter min num");  
      int entered_min_no = int_min.nextInt();      
      
      System.out.println("Enter max num");  
      int entered_max_no = int_max.nextInt();   

      //Generate random int value from entered_min_no to entered_max_no 
      System.out.println("Random value in int from "+entered_min_no+" to "+entered_max_no+ ":");
      if (entered_max_no > entered_min_no)
      {
         int random_int = (int)Math.floor(Math.random()*(entered_max_no-entered_min_no+1)+entered_min_no);
         System.out.println(random_int);
      }
      else
      {
        System.out.println("error: Max Number should be > Min Number");

      }
      
    }
}