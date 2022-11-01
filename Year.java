/*
*
* @author Lucia Enriquez
* @date 10/20/2022
*
* This class represents a calendar year.
*
* It contains a method that determines if
* the year is a leap year.
*
*/


public class Year{
    
    // declare your instance variables here
    private int theYear;

    // write your constructor here
    

    public Year(int y){
        // your code here
        theYear = y;
    }


    public boolean isLeapYear(){
        // your code here 
        if(theYear % 4 == 0 && theYear % 100 != 0 || theYear % 400 == 0) {
            return true;
        } else {
            return false;
        }

        

    }

}    
