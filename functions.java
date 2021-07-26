// Import the Scanner class
import java.util.Scanner;

//Main Class 
class functions_class {

  public static void main(String[] args) {
      reversestring();
      palindrome_str();
      random_no_generator();
  }

  
  // Rpalindrome_str string check method 
  //=====================================
  public static void palindrome_str() {
    String str, rev = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string to check palindrome:");
    str = sc.nextLine();

    int length = str.length();

    for ( int i = length - 1; i >= 0; i-- )
       rev = rev + str.charAt(i);

    if (str.equals(rev))
       System.out.println(str+" is a palindrome");
    else
       System.out.println(str+" is not a palindrome");

  }  

  // Reverse string method 
  //======================
  public static void reversestring() {

    // Create a Scanner object
    Scanner input_str = new Scanner(System.in);  
    System.out.println("Enter string to reverse");
    
    //Prompt user to enter string
    String entered_str = input_str.nextLine();  
    String reversedString = "";
    
    for(int i = entered_str.length()-1; i>=0; i--){
      reversedString = reversedString + entered_str.charAt(i);
    }
    
    System.out.print("The reversed string of the '"+entered_str+"' is: " );
    System.out.println(reversedString);

  }

  // random number generator
  //======================
  public static void random_no_generator() {

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

