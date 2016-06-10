
import byui.cit260.hauntedHotels.control.ChallengeControl;
import java.util.Scanner;

/*
 * THIS WAS AN ATTEMPT TO CREATE A ROOM CHALLENGE DIFFERENT THAN THE COMPLEX
 * EQUATION CHALLENGES. NOT SUBMITTED FOR LESSON 7 INDIVIDUAL ASSIGNMENT
 * BUT MAY BE USEFUL FOR A FUTURE ASSIGNMENT.
*/ 

/**
 *
 * @author scottbailey1234
 */
public class Room2View {
    
/*    private String promptMessage;

  
    public void displayBanner() {
        
        System.out.println("\n Location - Napa, California"
              + "\n"          
              + "\n Witness Report - Doors opening and slamming shut"
              + "\n with no-one staying on the floor or accessing"
              + "\n the floor for any reason."
              + "\n"          
              + "\n History - Three spirits are said to haunt the Napa River "
              + "\n Inn, which dates back to 1885. The unexplained activity "
              + "\n seems to center around the two guest rooms above Sweetie "
              + "\n Pie's Bakery, the site where one of the previous "
              + "\n owners of the building hung himself years ago."
              + "\n"
              + "\n What would you like to do? Hint: You've been"
              + "\n traveling all day and you are very hungry. Good thing"
              + "\n you are staying right above a bakery famous for its pies."
              + "\n");

    }
    
    public void displayRoom1View() {
        
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String room1Answer = this.getRoom1Answer();
            if (room1Answer.toUpperCase().equals("Q"))//user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
        
        done == this.doAction(room1Answer);
      } while (!done);
    }

    private String getRoom1Answer() {
        Scanner keyboard = new Scanner(System.in); //get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is enter
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; // end the loop
        }
        
        return value; // return the value entered
    }
    
    private String doAction(String room1Answer) {
        if (room1Answer.equals("eat pie")){
            return "\n Yummy!"
                + "\n"
                + "\n The Napa River Inn used to be a working mill.\"\n"
                + "\n Three ghosts are said to haunt the Napa River\"\n"
                + "\n Inn, Captain Albert Hatt Jr., his wife, and former mill\"\n"
                + "\n owner Rober Keig. All died in the mill in uncommon ways.\"\n";
                    
        }else{
            return "Try Again";
        }

   
    }
 */
}    