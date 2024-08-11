package basicprogram;

class Aswin {

    Aswin(int c){
        c=8;

    }
   public static String hi(String a) {
System.out.println("aswin");
return a;
         // Return the modified value
    }
}

public class methods {
    public static void main(String[] args) {
        String a ;  // Initialize the variable `a`
         int b=8;
        Aswin aswinInstance = new Aswin(7);
        //aswinInstance.Aswin(int b);// Create an instance of the Aswin class
        Aswin.hi("iioii");
        //a = aswinInstance.hi( "aswin");   // Call the hi method and store the result

        //System.out.println("The value of a after calling hi method: " + a);
        System.out.println("The value of a after calling hi method: " + b);  // Print the result
// Print the result
    }
}
