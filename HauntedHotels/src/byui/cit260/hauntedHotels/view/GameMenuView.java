/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

public class GameMenuView extends View {
     
    public GameMenuView() {
        super("\n"
               + "\n--------------------------------------------"
               + "\n| Game Menu                                |"
               + "\n--------------------------------------------"
               + "\nM - View the Map"
               + "\nH - View Housekeeping Inventory Menu"
               + "\nW - View Weapons Inventory Menu"
               + "\nTF - Test Rate Floor"
               + "\nTR - Test RevPar"
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
        housekeepingMenuView.display();
    }

    private void displayWeapons() {
        // Create WeaponsMenuView object
        WeaponsMenuView weaponsMenuView = new WeaponsMenuView();
        
        // Display the weapons menu view
        
        weaponsMenuView.display();
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

