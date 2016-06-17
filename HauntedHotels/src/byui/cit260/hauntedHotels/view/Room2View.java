package byui.cit260.hauntedHotels.view;
/**
 *
 * @author scottbailey1234
 */
public class Room2View extends View {

    public Room2View() {

        super("\n Location - Napa, California"
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
    
    @Override
    public boolean doAction(String value) {    
       
    if (!value.equals("eat pie")) { 
        System.out.println("Try Again. Hint: the correct answer is... eat pie");
        }
        else{
            
        if (value.equals("eat pie")){
            System.out.println("\n"
                + "\n Yummy!"
                    + "\n"
                    + "\n The Napa River Inn used to be a working mill."
                    + "\n Three ghosts are said to haunt the Napa River"
                    + "\n Inn, Captain Albert Hatt Jr., his wife, and former mill"
                    + "\n owner Rober Keig. All died in the mill in uncommon ways."); 

            return true;
        }
    }
    return false;
    }

}    