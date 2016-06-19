/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import byui.cit260.hauntedHotels.control.ChallengeControl;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class RateFloorView extends View {
    
    public RateFloorView () {
        
        super("\nPlease enter percent of the hotel"
                           + "\nrooms need to be booked:  ");
        // display the banner when view is created
        this.displayBanner();
    
}

    private void displayBanner() {
        System.out.println(
                "\n**********************************************************"
              + "\n* Figure out the minimum price to charge for your hotel  *"
              + "\n* rooms. You want to stay in this hotel but you want     *"
              + "\n* to pay the least amout possible. The hotel has 100     *"  
              + "\n* rooms and charges their guests $70/room.               *"
              + "\n* What percent of the hotel rooms need to be booked to   *"      
              + "\n* find a rate floor that is greater than $50 and less    *"      
              + "\n* than $60.                                              *" 
              + "\n*                                                        *"  
              + "\n* Player enters different numbers until the result is    *"
              + "\n* shown that is acceptable (between $50 and $60)         *"
              + "\n*                                                        *"
              + "\n**********************************************************"  
              );
    }
    @Override   
    public boolean doAction(String value){
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
