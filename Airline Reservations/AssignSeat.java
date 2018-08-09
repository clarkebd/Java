package AirplaneReservations;

import java.util.Scanner;

/**
 * @author Brian
 */
public class AssignSeat {

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

    public void checkSpaceAvailable(int desired)
    {
        boolean[] seat;
        seat = new boolean[10];
    
        System.out.printf("So you made it here with %d", desired);
        
        if (desired==1)
        {
            //check if space in first i.e. seats (0-4)
            for (int loop=0;loop<10;loop++)
            {
                if (seat[loop]==false)
                {
                    System.out.print("Space is still available in First class.");
                    int spaceAvailableInFirst=1;
                } 
            }
 
        }
        else
        {
            // check if space in couch i.e. seats 5-9
            System.out.print("I'm down in the else section.");
        }
        
    }
}
