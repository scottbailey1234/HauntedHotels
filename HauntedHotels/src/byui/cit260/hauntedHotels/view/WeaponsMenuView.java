/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

//author Viktor

import java.util.Scanner;


class WeaponsMenuView {
    
    private String menu;
    private String promptMessage;
    
    public WeaponsMenuView() {
            this.menu = "\n"
               + "\n----------------------------"
               + "\n| Weapons Menu             |"
               + "\n----------------------------"
               + "\nT - Typewriter"
               + "\nC - Calculator"
               + "\nP - Phone"
               + "\nM - Thermometer"
               + "\nQ - Quit"
               + "\n----------------------------";
    }

    public void displayWeaponsMenuView() {
         boolean done = false; // set flag to not done
        do {
        
            // prompt for and get players name
            String menuOption = this.getWeaponsMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done); 
    }

    private String getWeaponsMenuOption() {
        
        
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

            case "T": // Spray Disinfectant
                this.displayTypewriter();
                break;
            case "C": // Restock Towels
                this.displayCalculator();
                break;
            case "P": // Replace Sheets
                this.displayPhone();
                break;
            case "M": // Vaccum Floor
                this.displayThermometer();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayTypewriter() {
        System.out.println("*** displayTypewriter function called ***");
    }

    private void displayCalculator() {
        System.out.println("*** displayCalculator function called ***");
    }

    private void displayPhone() {
        System.out.println("*** displayPhone function called ***");
    }

    private void displayThermometer() {
        System.out.println("*** displayThermometer function called ***");
    }
    
}
