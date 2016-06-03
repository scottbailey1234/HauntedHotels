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
public class HelpMenuView {
        
    private String menu;
    private String promptMessage;
    
    public HelpMenuView() {
            this.menu = "\n"
               + "\n--------------------------------------------"
               + "\n| Help Menu                                |"
               + "\n--------------------------------------------"
               + "\nG - What is the goal of the game?"
               + "\nW - How to win"
               + "\nE - Hotel complex equation information"
               + "\nQ - Quit"
               + "\n--------------------------------------------";
    }
    public void displayHelpMenuView() {
        
        boolean done = false; // set flag to not done
        do {
        
            // prompt for and get players name
            String menuOption = this.getHelpMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done); 
    }

    private String getHelpMenuOption() {
        
        
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

            case "G": // display goal of the game
                this.displayGoal();
                break;
            case "W": // display how to win the game
                this.displayHow();
                break;
            case "E": // display complex equation help
                this.displayComplexHelp();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayGoal() {
        System.out.println("*** displayGoal function called ***");
    }

    private void displayHow() {
        System.out.println("*** displayHow function called ***");
    }

    private void displayComplexHelp() {
        System.out.println("*** displayHelpMenu function called ***");
    }
    
}
