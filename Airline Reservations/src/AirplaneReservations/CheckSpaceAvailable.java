/**
 * @author Brian
 * Java Homework Chapter 7 
 */

package AirplaneReservations;

import java.util.Scanner;

public class CheckSpaceAvailable
{
    public int offerChoice()
    {
         // Since no space available in First, offer choice in Coach
            System.out.print("\nWould you like to try a seat in Coach?\n");
            System.out.print("1 - Yes\n");
            System.out.print("2 - No\n");
            System.out.print("Choice? ");

            Scanner input = new Scanner(System.in); 
            int tryCoach = input.nextInt();
            return tryCoach;
    }
}
