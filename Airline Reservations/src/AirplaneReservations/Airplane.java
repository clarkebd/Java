/**
 * @author Brian
 * Java Homework Chapter 7 
 */

package AirplaneReservations;

public class Airplane {

    public static void main (String[] args) {
        
        int bookedCoach;
        int area=99; // used for menu selection
        
        // used to track all seats
        boolean[] allSeats; 
        allSeats = new boolean[10];
        
        //display welcome message
        AssignSeat newReservation = new AssignSeat();
        newReservation.displayWelcome();
  
    while (area !=4)
     {
        //ask which class to book in and return that value to 'area'
        int wantCoach = 0;

        area = newReservation.askClass();

        if (area==1)
        {
            int space=0;
            System.out.print("\nSeating desired in First Class.\n");
            System.out.print("Attempting to book seat ....\n");
 
            for ( int loop=0; loop<5; loop++)
            {
                if (allSeats[loop]==false)
                {
                     System.out.printf("Seat %d still available in First Class.\n", loop);
                     allSeats[loop]=true;
                     System.out.printf("Seat #%d in First has been booked.\n\n", loop);
                     space=1;
                     break;
                }
            }
            
            if (space != 1) // no room in first 
            {
                {
                    System.out.print("Sorry, First class is full!\n");
                    CheckSpaceAvailable checkCoach = new CheckSpaceAvailable();
                    wantCoach = checkCoach.offerChoice();
                }
            }
                      
                
        } // end IF FIRST
        
        
        if (area==2 || wantCoach==1)       
        {
            System.out.print("\nSeating desired in Coach.\n");
            System.out.print("Attempting to book seat ....\n");

            bookedCoach = newReservation.bookCoach();
           
            if (bookedCoach!=99) // was seat available?
            {
                System.out.printf("Seat #%d in Coach has been booked.\n\n", bookedCoach);
                allSeats[bookedCoach]=true;
            }
            else
            {
                System.out.print("Sorry, Coach class is full!\n");
                //checkSpaceAvailable checkCoach = new CheckSpaceAvailable();
                //wantCoach = checkCoach.offerChoice();
            }
        } // end IF Coach
        
        if (area==3)
        {
            for (int loop=0;loop<10;loop++)
            {
                if (allSeats[loop]==false)
                {
                    System.out.printf("Seat #%d = available\n", loop);
                }
                else
                {
                    System.out.printf("Seat #%d = SOLD\n", loop);
                }
            }
        } // end IF seat display
     } // end WHILE
     
    }  //end MAIN
} // end CLASS
