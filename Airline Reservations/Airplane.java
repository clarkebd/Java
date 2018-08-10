/**
 * @author Brian
 * 
 */

package AirplaneReservations;

import java.util.ArrayList;
import java.util.Scanner;

public class Airplane {


    public static void main (String[] args) {
       
        AssignSeat newReservation = new AssignSeat();
        
        int bookedCoach;
        int bookedFirst;
        boolean[] allSeats; // keep track of returned reserved seats with this
        allSeats = new boolean[10];
        
        //display welcome message
        newReservation.displayWelcome();
        
        //ask them which class they want to book in and return that value to 'area'
        int area = newReservation.askClass();
        
        
        if (area==1) {
            System.out.print("\nSeating desired in First Class.\n");
            System.out.print("Attempting to book seat ....\n");
            bookedFirst = newReservation.bookFirst();
            
            if (bookedFirst!=99) {
            System.out.printf("bookedFirst = %d", bookedFirst);
            }
            else
            {
                System.out.print("Sorry, First class is full!");
                AirplaneReservations.checkSpaceAvailable checkCoach = new AirplaneReservations.checkSpaceAvailable.offerChoice();
                
            }
            //maybe create a 10 space array here and fill in with the returned result from this
            //so this local array will keep track of which seats are already booked! 
            allSeats[bookedFirst]=true;
        }
        
        else
        
        {
            System.out.print("\nSeating desired in Coach.\n");
            System.out.print("Booking seat now...\n");
            bookedCoach = newReservation.bookCoach();
            System.out.printf("bookedCoach = %d", bookedCoach);
            
            //maybe create a 10 space array here and fill in with the returned result from this
            //so this local array will keep track of which seats are already booked! 
            allSeats[bookedCoach]=true;
        }
        
    }  
}

