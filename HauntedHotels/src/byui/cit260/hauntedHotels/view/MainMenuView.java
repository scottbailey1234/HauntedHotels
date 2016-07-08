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
     

    private void startNewGame(){

        try {   
            // create a new game
            GameControl.createNewGame(HauntedHotels.getPlayer());    
        } catch (MapControlException mce) {
            ErrorView.display("MainMenuView", mce.getMessage());
            return;
        } 

        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
  
    }
    private void startSavedGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            + "is saved.");
        
        String filePath = this.getInput();
        
        try {
            // start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        // display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        // prompt for and get the name of the file to save the game in
        this.console.println("\n\nEnter the file path for file where the game "
                            + "is to be saved.");
        String filePath = this.getInput();
        
        try {
            // save the game to the specified file
            GameControl.saveGame(HauntedHotels.getCurrentGame(), filePath);
        }
         catch (Exception ex) {
             ErrorView.display("MainMenuView", ex.getMessage());
         }
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }




}
