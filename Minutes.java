/** Minutes.java by lve2104.
 * Lucia Enriquez
 */
import java.util.Scanner;

public class Minutes {
    
    public static final void main(String[] args) {
        Scanner number = new Scanner(System.in); //User input 

    //System output
    System.out.print("Enter hours: ");
    int hours = number.nextInt();
    System.out.print("Enter days: ");
    int days = number.nextInt();
    System.out.print("Enter weeks: ");
    int weeks = number.nextInt();
    System.out.print("Enter years: ");
    int years = number.nextInt();
     System.out.println("Number of minutes is: " + ((hours*60) + (days*1440) + (weeks*10080) + (years*525600)));
  
    }
    
}
