/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import byui.cit260.hauntedHotels.control.GameControl;
import hauntedhotels.HauntedHotels;

/**
 *
 * @author Acer
 */
public class MainMenuView extends View {
   
    public MainMenuView() {
        super("\n"
               + "\n--------------------------------------------"
               + "\n| Main Menu                                |"
               + "\n--------------------------------------------"
               + "\nN - Start new game"
               + "\nG - Get and start saved game"
               + "\nH - Get help on how to play the game"
               + "\nS - Save game"
               + "\nQ - Quit"
               + "\n--------------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "G": // get and start an existing game
                this.startExistingGame();
                break;
            case "H": // display the help menu
                this.displayHelpMenu();
                break;
            case "S": // save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void startNewGame() {
    // create a new game
        GameControl.createNewGame(HauntedHotels.getPlayer());
        
        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
}
    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // Create HelpMenuView object
        HelpMenuView helpMenuView = new HelpMenuView();
                
        // Display the help menu view
        helpMenuView.display();
  
    }

    private void saveGame() {
        System.out.println("*** saveExistingGame function called ***");
    }
    
}
