/** Change.java by lve2104.
 * Lucia Enriquez
 */
import java.util.Scanner;

public class Change {
    
    public static final void main(String[] args) {
        Scanner moneyAmnt = new Scanner(System.in);

        //System output and variable declaration
        System.out.print("Enter amount due (in pennies): ");
        int amntDue = moneyAmnt.nextInt();

        System.out.print("Enter amount received (in pennies): ");
        int amntReceived = moneyAmnt.nextInt();

        int change = amntReceived - amntDue;
        int dollars = change/100;
        int quarters = (change % 100)/25;
        int dimes = (change % 100 % 25)/10;
        int nickels = (change % 100 % 25 % 10)/5;
        int pennies = (change % 100 % 25 % 10 % 5)/1;

        System.out.println("The change for this customer is: " + dollars + " dollars, " + quarters + " quarters, " 
                            + dimes + " dimes, " + nickels + " nickels, and " + pennies + " pennies.");

        
        
    }
    
    
}
