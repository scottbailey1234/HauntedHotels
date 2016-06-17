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
 * @author scottbailey1234
 */
public class Room1View extends View{

    public Room1View () {

        super("\n**********************************************************"
              + "\n* REVpar Challenge                                       *"
              + "\n**********************************************************"        
              + "\n You are a manager at <hotel>. The owner is considering"
              + "\n selling the hotel and they want to know how much income each"
              + "\n individual room brought in daily over the last year (365 days)."
              + "\n This means you’ll have to calculate REVpar. Considering that"
              + "\n you have 100 rooms available each night, what would your total"
              + "\n income for one year (365 days) need to be in order to get a"
              + "\n REVpar equal to or greater than $100/room."
              + "\n**********************************************************"  
              );
    }
    @Override
    public boolean doAction(String value){
      double totRev = Double.parseDouble(value);      
      ChallengeControl challengeControl = new ChallengeControl();
       
      
      double totRevPar = challengeControl.calcRevpar(totRev);
      
        if (totRevPar == -1){
          
          // totRev < 1 || totRev > 100000000
          System.out.println("\n Total Income must be greater than 1"
                           + "\n and less than 100 million or "
                           + "\n 100,000,000. Please try again... Hint: enter "
                           + "\n an amount equal to or larger"
                           + "\n than 3650000");
        }

        else {
             
          if (totRevPar < 100) {
            System.out.println("\n Your income per room for the past year"
                  + "\n is not desireable. Try to figure out the total income"
                  + "\n for the past year needed to average $100 or more"
                  + "\n per room. Hint: enter an amount equal to or larger"
                  + "\n than 3650000");    
          } else {
              System.out.println("\n You found a desireable REVpar!"
                      + "\n Your REVpar is: " + totRevPar);
              return true;
          }
                
    }
    return false;
    } 


}
