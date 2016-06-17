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
public class HousekeepingMenuView extends View{
    
    public HousekeepingMenuView() {
        super("\n"
               + "\n--------------------------------------------"
               + "\n| Housekeeping Menu                                |"
               + "\n--------------------------------------------"
               + "\nD - Spray Disinfectant"
               + "\nT - Restock Towels"
               + "\nS - Replace Sheets"
               + "\nF - Vacuum Floor"
               + "\nQ - Quit"
               + "\n--------------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
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

