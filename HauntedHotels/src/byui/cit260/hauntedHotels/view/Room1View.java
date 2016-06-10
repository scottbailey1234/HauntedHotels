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
public class Room1View {

    private String promptMessage;
    
    public Room1View () {
        
        this.promptMessage = "\nFind RevPar:  ";
        // display the banner when view is created
        this.displayBanner();
    
}

    private void displayBanner() {
        System.out.println(
                "\n**********************************************************"
              + "\n* REVpar Challenge"
              + "\n**********************************************************"        
              + "\n You are a manager at <hotel>. The owner is considering "
              + "\n selling the hotel and they want to know how much income each "
              + "\n individual room brought in daily over the last year (365 days)."
              + "\n This means you’ll have to calculate REVpar. Considering that "
              + "\n you have 100 rooms available each night, what would your total "
              + "\n income for one year (365 days) need to be in order to get a "
              + "\n REVpar equal to or greater than $100/room.*"
              + "\n**********************************************************"  
              );
    }
    
    public boolean doAction(double revParEquation){
        
      ChallengeControl challengeControl = new ChallengeControl();
      
      double totRev = challengeControl.calcRevpar((int) revParEquation);
      
        if (totRev == -1){
          
          // totRev < 1 || totRev > 100000000
          System.out.println("\nTotal Income must be greater than 1"
                           + "\n and less than 100 million or "
                           + "\n 100,000,000. Please try again...");
      }
        else {
          if (totRev < 100) {
            System.out.println("\nYour income per room for the past year"
                  + " is not desireable. Try to figure out the total income"
                  + " for the past year needed to average $100 or more"
                  + " per room.");    
          } else {
              System.out.println("\nYou found a desireable REVpar!"
                      + "\nYour REVpar is: " + totRev);
              return true;
          }

    }
    return false;
    } 
    private String getInput(){
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) {// loop wile an invalid value is entered
            
 //           System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
                     
            if (value.length()< 1){ //blank value entered
                System.out.println("\n*** Invalid value: value cannot be blank");
                continue;
            }
            break; //end the loop
        }
        return value;
    }
    
    public void display() {
        
        String value;
        boolean done = false;
        
        do {
            System.out.println(this.promptMessage);
            
            double revPar = 0.0;
            
            System.out.println("\nFigure out how much income is required to get a REVpar "
                           + "\nequal to or greater than $100/room:  ");
                                      
            revPar = Double.parseDouble(getInput());
            
            done = this.doAction(revPar);
        } while (!done);
    }


}
