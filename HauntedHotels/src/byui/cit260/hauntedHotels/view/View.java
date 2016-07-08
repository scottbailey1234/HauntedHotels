/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;


import hauntedhotels.HauntedHotels;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.PrintWriter;


public abstract class View implements ViewInterface {
    
    private String promptMessage;
    private boolean input = true;
    
    protected final BufferedReader keyboard = HauntedHotels.getInFile();
    protected final PrintWriter console = HauntedHotels.getOutFile();

    public View() {
        this.input = true;
    }
    
    public View(boolean input, String message) {
        this.input = input;
        this.promptMessage = message;
    }

    public View(String message) {
        this.promptMessage = message;
        this.input = true;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String message) {
        this.promptMessage = message;
    }
    
    
    public void display() {
        String value = "";
        boolean done = false;
        
        do { 
            this.console.println(this.promptMessage); // display the prompt promptMessage
            if (this.input) {
                value = this.getInput(); // get the user's selection
            }
            done = this.doAction(value); // do action based on selection        
        } while (!done);

    }
    
        
/*    protected String displayMessage;
    private Object keyboard;
    
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
*/    
    @Override
    public String getInput() {
        
//        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        boolean valid = false; //initialize to not valid
        String value = null;
        try {
        
        // while a valid name has not been retrieved        
        while (!valid) { // loop while an invalid value is enter
            
            // prompt for the player's name
//            System.out.println("\n" + this.displayMessage);
            
            // get the value entered from the keyboard
            value = keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // blank value entered
                ErrorView.display(this.getClass().getName(),
                                "You must enter a value.");
//                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            
            break; // end the loop
        }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                            "Error reading input: " + e.getMessage());
//            System.out.println("Error reading input: " + e.getMessage());
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

