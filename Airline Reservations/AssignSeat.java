/**
 * @author Brian
 */

package AirplaneReservations;

import java.util.Arrays;
import java.util.Scanner;

public class AssignSeat
{

    public void displayWelcome()
    {
        System.out.println(" - - - Airline Reservations - - -");
    }

    public int askClass()
    {
        System.out.print("\033[H\033[2J"); // clear the console
        System.out.print("\nWhere would you like to sit:\n");
        System.out.print("1 - First Class\n");
        System.out.print("2 - Coach\n");
        System.out.print("Choice? ");

        Scanner input = new Scanner(System.in);
        int area = input.nextInt();

        return area;
    }

    
    public int bookFirst()
    {
            boolean[] first = new boolean[5];
            
            // testing purposes only
            first[0]=true; // seat full
            first[1]=true; // seat full
            //first[2]=true; // seat full
            //first[3]=true; // seat full
            //first[4]=true; // seat full
            
            
            //check if space in first i.e. seats (0-4)
            for (int loop=0;loop<5;loop++)
            {
                if (first[loop]==false)
                {
                    System.out.printf("Seat %d still available in First Class. Booking it for you!\n", loop);
                    first[loop]=true;
                    
                    return loop; //i.e. return seat # booked in first (0-4)
                } 
            }
                    
                    
        //System.out.print(Arrays.toString(first));
        return 99; // we weren't able to book a seat in First, so return 99
    }
    

    public int bookCoach()
    {
            boolean[] coach = new boolean[5];
            
                 //check if space in coach i.e. seats (5-9)
                for (int loop=0;loop<5;loop++)
                {
                    if (coach[loop]==false)
                    {
                        System.out.printf("Seat %d still available in Coach Class.Booking it for you!\n", loop);
                        coach[loop]=true;
                        return loop;
                    } 
                } 
          System.out.print(Arrays.toString(coach));            
          return 0;                
    }

}