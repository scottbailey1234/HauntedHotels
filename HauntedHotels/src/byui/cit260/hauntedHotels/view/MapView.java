/*
 * THIS MENU IS PROBABLY NOT NECESSARY BUT IS BEING USED TO TEST THE ROOM1VIEW CLASS.
 */
package byui.cit260.hauntedHotels.view;

import java.util.Scanner;

/**
 *
 * @author scottbailey1234
 */
public class MapView {

    private String menu;
    private String promptMessage;
   
    public MapView() {
     this.menu = "\n"
               + "\n--------------------------------------------"
               + "\n| Map Menu                                |"
               + "\n--------------------------------------------"
               + "\n1 - Napa River Inn: Room 207"
               + "\n2 - Napa River Inn: Room 208"
               + "\n3 - Omni Parker House Room 203"
               + "\n4 - Crescent Hotel: Room 202"
               + "\n5 - Crescent Hotel: Room 218"
               + "\n6 - Crescent Hotel: Room 418"
               + "\n7 - Myrtles Plantation: The Game Room"
               + "\n8 - Queen Anne Hotel: Room 410"
               + "\n9 - Mason House Inn: Room 5"
               + "\n10 - Ramada Plaza Hotel: Room 717"
               + "\n11 - Madonna Manor: Room 101"
               + "\n12 - Brown Palace: Room 904"
               + "\n13 - Stanley Hotel: Room 217"
               + "\n14 - Stanley Hotel: Room 418"
               + "\n15 - The Oregon Caves Chateau: Room 310"
               + "\n16 - Langham Hotel: Room 333"
               + "\n17 - Hotel Roosevelt: Room 229"
               + "\n18 - Hotel Roosevelt: Room 928"
               + "\n19 - Russell Hotel: Room 8"
               + "\n20 - Lizzie Borden Bed & Breakfast: Guest Room"
               + "\n21 - Hotel Provencial: Room 101"
               + "\n22 - Skirrid Mountain Inn: Lounge"
               + "\n23 - Hotel Burchianti: 2nd floor corridor"
               + "\n24 - Room 24"
               + "\n25 - Room 25"
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
            case "M": // display Game Menu
                this.displayGameMenu();
                break;
            case "1": // display room challenge 1
                this.displayRoom1();
                break;
            case "2": // display room challenge 2
                this.displayRoom2();
                break;
            case "3": // display room challenge 3
                this.displayRoom3();
                break;
            case "4": // display room challenge 4
                this.displayRoom4();
                break;
            case "5": // display room challenge 5
                this.displayRoom5();
                break;
            case "6": // display room challenge 6
                this.displayRoom6();
                break;
            case "7": // display room challenge 7
                this.displayRoom7();
                break;
            case "8": // display room challenge 8
                this.displayRoom8();
                break;
            case "9": // display room challenge 9
                this.displayRoom9();
                break;
            case "10": // display room challenge 10
                this.displayRoom10();
                break;
            case "11": // display room challenge 11
                this.displayRoom11();
                break;
            case "12": // display room challenge 12
                this.displayRoom12();
                break;
            case "13": // display room challenge 13
                this.displayRoom13();
                break;
            case "14": // display room challenge 14
                this.displayRoom14();
                break;
            case "15": // display room challenge 15
                this.displayRoom15();
                break;
            case "16": // display room challenge 16
                this.displayRoom16();
                break;
            case "17": // display room challenge 17
                this.displayRoom17();
                break;
            case "18": // display room challenge 18
                this.displayRoom18();
                break;
            case "19": // display room challenge 19
                this.displayRoom19();
                break;
            case "20": // display room challenge 20
                this.displayRoom20();
                break;
            case "21": // display room challenge 21
                this.displayRoom21();
                break;
            case "22": // display room challenge 22
                this.displayRoom22();
                break;
            case "23": // display room challenge 23
                this.displayRoom23();
                break;
            case "24": // display room challenge 24
                this.displayRoom24();
                break;
            case "25": // display room challenge 25
                this.displayRoom25();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }
    private void displayGameMenu() {
        //display the GameMenuView object
        GameMenuView gameMenu = new GameMenuView();
        
        // Display the game menu
        gameMenu.displayMenu();
    }
    
    private void displayRoom1() {
        // Create Room1View object
        Room1View room1 = new Room1View();
                
        // Display room 1 view
        room1.displayBanner();
    }
    
    private void displayRoom2() {
       System.out.println("*** displayRoom2 function called ***");
    }
    
    private void displayRoom3() {
       System.out.println("*** displayRoom3 function called ***");
    }
    
    private void displayRoom4() {
       System.out.println("*** displayRoom4 function called ***");
    }
    
    private void displayRoom5() {
       System.out.println("*** displayRoom5 function called ***");
    }
    
    private void displayRoom6() {
       System.out.println("*** displayRoom6 function called ***");
    }
    private void displayRoom7() {
       System.out.println("*** displayRoom7 function called ***");
    }
    
    private void displayRoom8() {
       System.out.println("*** displayRoom8 function called ***");
    }
    
    private void displayRoom9() {
       System.out.println("*** displayRoom9 function called ***");
    }
    
    private void displayRoom10() {
       System.out.println("*** displayRoom10 function called ***");
    }
    
    private void displayRoom11() {
       System.out.println("*** displayRoom11 function called ***");
    }

    private void displayRoom12() {
       System.out.println("*** displayRoom12 function called ***");
    }
    
    private void displayRoom13() {
       System.out.println("*** displayRoom13 function called ***");
    }
    
    private void displayRoom14() {
       System.out.println("*** displayRoom14 function called ***");
    }
    
    private void displayRoom15() {
       System.out.println("*** displayRoom15 function called ***");
    }
    
    private void displayRoom16() {
       System.out.println("*** displayRoom16 function called ***");
    }    
    
    private void displayRoom17() {
       System.out.println("*** displayRoom17 function called ***");
    }
    
    private void displayRoom18() {
       System.out.println("*** displayRoom18 function called ***");
    }
    
    private void displayRoom19() {
       System.out.println("*** displayRoom19 function called ***");
    }
    
    private void displayRoom20() {
       System.out.println("*** displayRoom20 function called ***");
    }
    
    private void displayRoom21() {
       System.out.println("*** displayRoom21 function called ***");
    }

    private void displayRoom22() {
       System.out.println("*** displayRoom22 function called ***");
    }
    
    private void displayRoom23() {
       System.out.println("*** displayRoom23 function called ***");
    }
    
    private void displayRoom24() {
       System.out.println("*** displayRoom24 function called ***");
    }
    
    private void displayRoom25() {
       System.out.println("*** displayRoom25 function called ***");
    }
        
}

    

