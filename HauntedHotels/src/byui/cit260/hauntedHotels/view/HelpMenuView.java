/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

public class HelpMenuView extends View {
        
    public HelpMenuView() {
        super("\n"
               + "\n--------------------------------------------"
               + "\n| Help Menu                                |"
               + "\n--------------------------------------------"
               + "\nG - What is the goal of the game?"
               + "\nW - How to win"
               + "\nE - Hotel complex equation information"
               + "\nQ - Quit"
               + "\n--------------------------------------------");
    }
    
    @Override
    public boolean doAction(String choice) {
        
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
