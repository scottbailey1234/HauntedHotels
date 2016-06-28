/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import byui.cit260.hauntedHotels.control.GameControl;
import byui.cit260.hauntedHotels.exceptions.MapControlException;
import hauntedhotels.HauntedHotels;

public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
              + "\n-----------------------------------------"
              + "\n| Main Menu                             |"
              + "\n-----------------------------------------"
              + "\nN - Start new game"
              + "\nG - Get and start saved game"
              + "\nH - Get help on how to play the game"
              + "\nS - Save game"
              + "\nQ - Quit"
              + "\n-----------------------------------------");
    }
    @Override
    public boolean doAction(String obj) {
   
 
        String value = (String) obj;       
        value = value.toUpperCase(); // convert to all upper case
        char choice = value.charAt(0); // get first character entered

        switch (choice) {
            case 'N': // create and start a new game
                this.startNewGame();
                break;
            case 'G': // get and start an existing game
                this.startSavedGame();
                break;
            case 'H': // display the help menu
                this.displayHelpMenu();
                break;
            case 'S': // save the current game
                this.saveGame();               
                break;
            case 'Q': // Exit the program
                return true;

        }

        return false;
    }
     

    private void startNewGame() {
        
        try {   
            // create a new game
            GameControl.createNewGame(HauntedHotels.getPlayer());    
        } catch (MapControlException mce) {
            ErrorView.display("MainMenuView", mce.getMessage());
            return;
        } 
    }
    private void startSavedGame() {
        System.out.println("*** startSavedGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }




}
