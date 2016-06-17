/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

//author Viktor

import java.util.Scanner;


class WeaponsMenuView extends View {

    public WeaponsMenuView() {
        super("\n"
               + "\n----------------------------"
               + "\n| Weapons Menu             |"
               + "\n----------------------------"
               + "\nT - Typewriter"
               + "\nC - Calculator"
               + "\nP - Phone"
               + "\nM - Thermometer"
               + "\nQ - Quit"
               + "\n----------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        
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
