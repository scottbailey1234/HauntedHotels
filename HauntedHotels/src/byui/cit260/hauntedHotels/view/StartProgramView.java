/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import byui.cit260.hauntedHotels.control.GameControl;
import byui.cit260.hauntedHotels.model.Player;

/**
 *
 * @author Acer
 */
public class StartProgramView extends View {
    
    public StartProgramView() {
        
      super("\nPlease enter your name: ");
        // display the banner when view is created
        this.displayBanner();
        
    }

    private void displayBanner() {
        
        System.out.println(
                "\n**********************************************************"
              + "\n* Haunted Hotels will provide entertainment to all types *"
              + "\n* of users as they explore 25 rea-world haunted hotel    *"
              + "\n* rooms. The player will follow a sequence of room       *"  
              + "\n* experiences in which they can read background          *"
              + "\n* information about the haunted hotel room and complete  *"      
              + "\n* room challenges. Players cannot proceed to the next    *"      
              + "\n* haunted hotel room until they have successfully        *" 
              + "\n* completed each challenge in the sequence.              *"  
              + "\n*                                                        *"
              + "\n* Several 'weapons' and other inventory items can be     *"
              + "\n* used to assist in completing each challenge            *"  
              + "\n* successfully. Inventory items will be designed to      *"  
              + "\n* be related to a haunted hotel guest experience. For    *"  
              + "\n* example, a typewriter can be used in some way as a     *"
              + "\n* weapin of choice for the Stanley Hotel: Room 217       *"  
              + "\n* challenge. Once all challenges have been completed,    *"  
              + "\n* the player will complete a full tour of the top 25     *"  
              + "\n* most haunted hotel rooms in the world.                 *"
              + "\n*                                                        *"
              + "\n**********************************************************"  
              );
    }

    @Override
    public boolean doAction(String value) {
        if (value.length() < 2) {
            System.out.println("\nInvalid players name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        
        // call createPlayer() control function
        Player player = GameControl.createPlayer(value);
        
        if (player == null) { //if usuccessful
            System.out.println("\nError creating the player.");
            return false;
        }
        
        //display next view
        this.displayNextView(player);
        
        return true; // success !
          
    }

    private void displayNextView(Player player) {
        // display a custom welcome message
        System.out.println("\n=============================================="
                          + "\n Welcome to the game " + player.getName()
                          + "\n We hope you have a lot of fun!"
                          + "\n============================================="
                          );
        
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
                
        // Display the main menu view
        mainMenuView.display();
    }

       
}
    

