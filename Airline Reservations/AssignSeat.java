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
        System.out.println(" - - - Airline Reservations - - -");
    }

    public int askClass()
    {
        System.out.print("\nWhere would you like to sit:\n");
        System.out.print("1 - First Class\n");
        System.out.print("2 - Coach\n");
        System.out.print("3 - List Seats Available\n");
        System.out.print("4 - exit\n");
        System.out.print("Choice? ");

        Scanner input = new Scanner(System.in);
        int area = input.nextInt();

        return area;
    }


    public int bookCoach()
    {
            boolean[] coach = new boolean[5+5]; // arrays start at 0, so add 5 to get correct coach seat #'s
            
              //check if space in coach i.e. seats (5-9)
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
          return 99;                
    } // end bookCoach
} // end CLASS
