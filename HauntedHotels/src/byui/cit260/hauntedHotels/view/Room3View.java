/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import byui.cit260.hauntedHotels.control.ChallengeControl;

/**
 *
 * @author Acer
 */
public class Room3View extends View {
    
    public Room3View() {
        
         super("\nPlease enter percent of the hotel"
             + "\nrooms need to be booked:  ");
        // display the banner when view is created
        this.displayBanner();
    }
        private void displayBanner() {
                System.out.println(
                "\n*************************************************************"       
              + "\n* Location - Omni Parker House Hotel, Boston, Massachusetts *"
              + "\n*                                                           *"          
              + "\n* A former stage actress haunts the third floor             *"
              + "\n* of this Boston hotel,and a businessman died in room 303.  *"
              + "\n* Longfellow, a frequent guest, also liked to stay          *"
              + "\n* on the third floor, and the elevator often travels        *"          
              + "\n* to that floor when no buttons are pressed.                *"
              + "\n*                                                           *"
              + "\n* Because of this history the third floor is very popular.  *"
              + "\n* Groups of tourists often want to book rooms on the third  *"
              + "\n* floor. Hotel managers often need to know the minimum      *"
              + "\n* amount they are willing to sell their rooms for.          *"
              + "\n* You are a manager in this hotel and you want to find      *"
              + "\n* what percent of the hotel rooms need to be booked to find *" 
              + "\n* a rate floor that is greater than $50 and less than $60.  *"
              + "\n*                                                           *"
              + "\n* Player enters different numbers until the result is shown *"
              + "\n* that is acceptable (between $50 and $60)                  *"
              + "\n*                                                           *"
              + "\n*************************************************************"
              );

    }

    @Override
    public boolean doAction(String value) {
        double percentBooked = Double.parseDouble(value);        
      ChallengeControl challengeControl = new ChallengeControl();
      
      double floorRate = challengeControl.rateFloor(percentBooked);
      if (floorRate == -1){
          System.out.println("\nPercent of rooms booked must be more than 0"
                           + "\nand less than or equal to 100. Please try again");
      }
      else {
          System.out.println("\nYou found the right percent of rooms booked!"
                           + "\nYour floor rate is: " + floorRate);
          
      }
      return false;
    }
    
}
