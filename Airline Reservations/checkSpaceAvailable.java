/**
 * @author Brian
 */

package AirplaneReservations;

import java.util.Scanner;

/**
 * @author Brian
 */
public class checkSpaceAvailable
{
    public int offerChoice()
    {
         // Since no space available, offer choice in Coach
                System.out.print("Sorry, First class is full.");
                System.out.print("Would you like to try a seat in Coach?");
                System.out.print("1 - Yes\n");
                System.out.print("2 - No\n");
                System.out.print("Choice? ");

                Scanner input = new Scanner(System.in); 
                int tryCoach = input.nextInt();
                return tryCoach;
    }
}
