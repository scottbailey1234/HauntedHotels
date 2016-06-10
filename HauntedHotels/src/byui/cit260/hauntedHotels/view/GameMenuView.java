/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class GameMenuView {
    
/*    public void displayMenu() {
              
    }*/
    private String menu;
    private String promptMessage;
   
    public GameMenuView() {
     this.menu = "\n"
               + "\n--------------------------------------------"
               + "\n| Game Menu                                |"
               + "\n--------------------------------------------"
               + "\nM - View the Map"
               + "\nH - View Housekeeping Inventory Menu"
               + "\nW - View Weapons Inventory Menu"
               + "\nTF - Test Rate Floor"
               + "\nTR - Test RevPar"
               + "\nQ - Quit"
               + "\n--------------------------------------------";
    }
   
    public void displayMenu() {
        
        boolean done = false; // set flag to not done
        do {
        
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done); 
    }

    private String getMenuOption() {
        
        
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
            case "M": // display the map
                this.displayMap();
                break;
            case "H": // display housekeeping inventory
                this.displayHousekeeping();
                break;
            case "W": // display weapons inventory
                this.displayWeapons();
                break;
            case "TF": // display RateFloorView
                this.displayRateFloor();
                break;
            case "TR": // display Room1View - REVpar
                this.displayRoom1();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    private void displayMap() {
        System.out.println("\n*** displayMap function called");

/*        // Create MapuView object
        MapView mapMenu = new MapView();
            //display the game menu
       
        // Display the map view
        mapMenu.displayMenu();
*/   
    }

    private void displayHousekeeping() {
        // Create HousekeepingMenuView object
        HousekeepingMenuView housekeepingMenuView = new HousekeepingMenuView();
                
        // Display the housekeeping menu view
        housekeepingMenuView.displayHousekeepingMenuView();
    }

    private void displayWeapons() {
        // Create WeaponsMenuView object
        WeaponsMenuView weaponsMenuView = new WeaponsMenuView();
        
        // Display the weapons menu view
        
        weaponsMenuView.displayWeaponsMenuView();
    }
    
    private void displayRateFloor() {
        // Create RateFloorView object
        RateFloorView displayBanner = new RateFloorView();
                
        // Display the RateFloor view
        displayBanner.display();
    }

    private void displayRoom1() {
        // Create Room1View object
        Room1View displayBanner = new Room1View();
        
        // Display the Room1 view
        
        displayBanner.display();
    }
    
}

