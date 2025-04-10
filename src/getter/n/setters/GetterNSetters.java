package getter.n.setters;

import java.util.Scanner;

public class GetterNSetters {

    public static void main(String[] args) {
//Object calling
    Scanner scan = new Scanner(System.in);
    Login Log = new Login();
    
    System.out.print("Enter a name: ");
    String name = scan.nextLine();
//setter
    Log.setName(name); //use it to retrieve the value
    
//Dispaly
    System.out.print("Name is " + Log.getName()); 
    }
   /// System.out.println("jghjhb");
    
    
}
