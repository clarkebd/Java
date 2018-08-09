/**
 * @author Brian
 * test git change
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
        
        
        newReservation.displayWelcome();
        int area = newReservation.askClass();
        
        if (area==1) {
            System.out.print("\nSeating desired in First Class.\n");
            System.out.print("Booking seat now....\n");
            bookedFirst = newReservation.bookFirst();
            System.out.printf("bookedFirst = %d", bookedFirst);
            
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

