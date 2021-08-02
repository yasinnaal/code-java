
import java.util.*; 

public class person {

    public String FirstName;
    public String LastName;
    public String Birthdate;         
}

class MainPro {

    public static void main(String[] args) {

        person John = new person();

        John.FirstName = "John"   ; 
        John.LastName = "Peterson"   ; 
        John.Birthdate = "1980" ;

        System.out.println("Full Name: " + John.FirstName + " " + John.LastName) ;
        System.out.println("Birthdate: " +  John.Birthdate ) ;

    }
}

