/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import byui.cit260.hauntedHotels.control.GameControl;
import byui.cit260.hauntedHotels.model.HotelLocation;
import byui.cit260.hauntedHotels.model.Scene;
import hauntedhotels.HauntedHotels;
import java.io.PrintWriter;

public class GameMenuView extends View {
        

    public GameMenuView() {
        super("\n"
               + "\n--------------------------------------------"
               + "\n| Game Menu                                |"
               + "\n--------------------------------------------"
               + "\nM - View the Map"
               + "\nL - View a Location"
               + "\nN - Move actor to a new location"
               + "\nH - View Housekeeping Inventory Menu"
               + "\nW - View Weapons Inventory Menu"               
               + "\nTR - Test RevPar"
               + "\nTR2 - Test Room2Challenge"
               + "\nTR3 - Test Room3Challenge"
               + "\nQ - Quit"
               + "\n--------------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); // convert choice to upper case
        
        switch (choice) {
            case "M": // display the map
                this.displayMap(); 
                break;
            case "L": // // view current location
                this.viewLocation(); 
                break;
            case "N": // move actor to new location
                this.moveActors(); 
                break;                
            case "H": // display housekeeping inventory
                this.displayHousekeeping();
                break;
            case "W": // display weapons inventory
                this.displayWeapons();
                break;            
            case "TR": // display Room1View - REVpar
                this.displayRoom1();
                break;
            case "TR2": // display Room2View - Napa Pie Challenge
                this.displayRoom2();
                break; 
            case "TR3": // display RateFloorView
                this.displayRoom3();
                break;

            default:
                ErrorView.display("GameMenuView", "*** Invalid selection *** Try again");
        }
        return false;

    }

    private void displayMap() {
       this.viewMap(HauntedHotels.getOutFile()); 
    }
    
    public void viewMap(PrintWriter out) {
        int lineLength = 0;
        
        // get the map for the game
        HotelLocation[][] locations = GameControl.getMapLocations();
        int noColumns = locations[0].length; // get number columns in row
        
        this.printTitle(out, noColumns, "HAUNTED HOTEL LOCATIONS");
        this.printColumnHeaders(out, noColumns);
        
        for (int i = 0; i < locations.length; i++) {    
            HotelLocation[] rowLocations = locations[i];
            this.printRowDivider(out, noColumns);
            out.println(); // move down one i
            if (i < 9)
                out.print(" " + (i+1));
            else 
                out.print(i+1);
            
            // for every column in the row
            for (int column = 0; column < noColumns; column++) {
                out.print("|"); // print column divider
                HotelLocation location = rowLocations[column];
                if (location != null && location.isVisited()) { // if location is visited 
                    
                    Scene scene = location.getScene();
                    if (scene != null)
                        out.print(scene.getMapSymbol());
                    else
                        out.print("    ");
                }
                else {
                    out.print(" ?? ");
                }      
            }
            
            out.print("|"); // print column divider
        }
        
        this.printRowDivider(out, noColumns);
    }  
    private void moveActors() {
        MoveActorView moveActorView = new MoveActorView();     
        moveActorView.display();     
    }

    private void viewLocation() {
        ViewLocationView viewLocationView = new ViewLocationView();
        viewLocationView.display();
    }

    private void displayHousekeeping() {
        // Create HousekeepingMenuView object
        HousekeepingMenuView housekeepingMenuView = new HousekeepingMenuView();
                
        // Display the housekeeping menu view
        housekeepingMenuView.display();
    }

    private void displayWeapons() {
        // Create WeaponsMenuView object
        WeaponsMenuView weaponsMenuView = new WeaponsMenuView();
        
        // Display the weapons menu view
        
        weaponsMenuView.display();
    }
        
    private void displayRoom1() {
        // Create Room1View object
        Room1View displayBanner = new Room1View();
        
        // Display the Room1 view
        
        displayBanner.display();
    }
    
    private void displayRoom2() {
        // Create Room2View object
        Room2View displayBanner = new Room2View();
        
        // Display the Room1 view
        
        displayBanner.display();
    }
    private void displayRoom3() {
        // Create RateFloorView object
        Room3View displayBanner = new Room3View();
                
        // Display the RateFloor view
        displayBanner.display();
    }


    private void printColumnHeaders(PrintWriter out, int noOfColumns) {
        for (int i = 1; i < noOfColumns+1; i++) {
            if (i < 10) {
                out.print("   " + i + " ");
            }
            else {
                out.print("  " + i + " ");
            }
        }
    }

    private void printRowDivider(PrintWriter out, int noColumns) {
        out.println();
        out.print("  ");
        for (int i = 0; i < noColumns; i++) { // print row divider
                out.print("-----");
        }
        out.print("-");
    }

    private void printTitle(PrintWriter out, int noOfColumns, String title) {
        
        int titleLength = title.length();
        int lineLength = noOfColumns * 5 + 3;
        int startPosition = (lineLength / 2) - (titleLength / 2);
        out.println("\n");
        for (int i = 0; i < startPosition; i++) {
            out.print(" ");  
        }
        out.print(title);
        out.println("\n");
        
    }
    
}

