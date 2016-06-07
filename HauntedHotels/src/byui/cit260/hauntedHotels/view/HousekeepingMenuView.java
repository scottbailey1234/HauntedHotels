/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import java.util.Scanner;

/**
 *
 * @author scottbailey1234
 */
public class HousekeepingMenuView {
    
    private String menu;
    private String promptMessage;
    
    public HousekeepingMenuView() {
            this.menu = "\n"
               + "\n--------------------------------------------"
               + "\n| Housekeeping Menu                                |"
               + "\n--------------------------------------------"
               + "\nD - Spray Disinfectant"
               + "\nT - Restock Towels"
               + "\nS - Replace Sheets"
               + "\nF - Vacuum Floor"
               + "\nQ - Quit"
               + "\n--------------------------------------------";
    }
    public void displayHousekeepingMenuView() {
        
        boolean done = false; // set flag to not done
        do {
        
            // prompt for and get players name
            String menuOption = this.getHousekeepingMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done); 
    }

    private String getHousekeepingMenuOption() {
        
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.menu);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length()< 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {

            case "D": // Spray Disinfectant
                this.displayDisinfectant();
                break;
            case "T": // Restock Towels
                this.displayTowels();
                break;
            case "S": // Replace Sheets
                this.displaySheets();
                break;
            case "F": // Vaccum Floor
                this.displayFloor();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayDisinfectant() {
        System.out.println("*** displayDisinfectant function called ***");
    }

    private void displayTowels() {
        System.out.println("*** displayTowels function called ***");
    }

    private void displaySheets() {
        System.out.println("*** displaySheets function called ***");
    }
    private void displayFloor() {
        System.out.println("*** displayFloor function called ***");
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

