/**
 * @author Brian
 * Java Homework Chapter 7 
 */

package AirplaneReservations;

import java.util.Scanner;

public class AssignSeat
{

    public void displayWelcome()
    {
        System.out.println("_________________________________");
        System.out.println(" - - - Airline Reservations - - -");
        System.out.println("_________________________________\n");
    }

    public int askClass()
    {
        System.out.print("\nWhere would you like to sit:\n");
        System.out.print("1 - First Class\n");
        System.out.print("2 - Coach\n");
        System.out.print("3 - List Seats Available\n");
        System.out.print("4 - exit\n");
        System.out.print("5 - beta feature...\n");
        System.out.print("Choice? ");

        Scanner input = new Scanner(System.in);
        int area = input.nextInt();

        return area;
    }

    // array to keep track of available coach seats. Had to keep outside of method
    // so array would be maintained after returning. Arrays start at 0 always, so
    // added 5 to get correct coach seat #'s (i.e. 5-9)
    boolean[] coach = new boolean[5+5]; 
 
    public int bookCoach()
    {
              //check if space in coach i.e. seats (5-9), if so assigned seat.
                for (int loop=5;loop<10;loop++)
                {
                    if (coach[loop]==false)
                    {
                        System.out.printf("Seat %d still available in Coach Class.\n", loop);
                        System.out.print("Booking seat now...\n");
                        coach[loop]=true;
                        return loop;
                    } 
                }       
          return 99;  // return 99 if no seats in coach are empty               
    } // end bookCoach
} // end CLASS
