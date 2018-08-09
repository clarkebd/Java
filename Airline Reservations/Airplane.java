/**
 * @author Brian
 */

package AirplaneReservations;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Airplane {


    public static void main (String[] args) {
       
        AssignSeat newReservation = new AssignSeat();
        
        newReservation.displayWelcome();
        int area = newReservation.askClass();
        
        if (area==1) {
            System.out.print("\nSeating desired in First Class.");
        }
        else
        {
            System.out.print("\nSeating desired in Coach.");
        }
        
        newReservation.checkSpaceAvailable(area);
        
    }
    
    
    
           
    
}
