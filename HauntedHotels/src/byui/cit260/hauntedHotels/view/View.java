/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import java.util.Scanner;


public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }
    @Override
    public void display() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))//user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done); // exit the view when done == true
    }
    
    @Override
    public String getInput() {
        
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        boolean valid = false; //initialize to not valid
        String value = null;
        
        // while a valid name has not been retrieved        
        while (!valid) { // loop while an invalid value is enter
            
            // prompt for the player's name
            System.out.println("\n" + this.displayMessage);
            
            // get the value entered from the keyboard
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // blank value entered
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }
    
    public String getBlockedMessage(String message) {
        String newMessage = "";
        int noOfLines = (message.length() / 81) + 1;
        String[] words = message.split(" ");
        String line = "";
        
        for (String word : words) {
            
            if (line.length() + word.length() < 80) {
                line += word.trim() + " ";
            }
            else {
                newMessage += line + "\n";
                line = word.trim() + " ";
            }
        }
        newMessage += line;
        
        
        return newMessage;
        
        
    }
}

