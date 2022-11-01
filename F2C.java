/** F2C.java by lve2104.
 * Lucia Enriquez
 */
import java.util.Scanner;

public class F2C {
    
    public static final void main(String[] args) {
        Scanner degreesFahren = new Scanner(System.in);  // Scanner object for Fahrenheit 
    
        System.out.print("Enter degrees in fahrenheit. Degrees = ");

        int degrees = degreesFahren.nextInt(); // Read user input
        int degreesCel = (degrees - 32)*5/9;
        System.out.println("Your input converts to: " + degreesCel + " degrees Celsius");  // Output user input
        
        
        
    }
    
    
}
