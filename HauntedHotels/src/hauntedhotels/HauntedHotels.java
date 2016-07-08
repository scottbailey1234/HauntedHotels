/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhotels;

import byui.cit260.hauntedHotels.model.Challenge;
import byui.cit260.hauntedHotels.model.Player;
import byui.cit260.hauntedHotels.enums.Actor;
import byui.cit260.hauntedHotels.model.Game; 
import byui.cit260.hauntedHotels.model.HotelLocation;
import byui.cit260.hauntedHotels.model.Map;
import byui.cit260.hauntedHotels.model.InventoryItems;
import byui.cit260.hauntedHotels.model.Scene;
import byui.cit260.hauntedHotels.view.GameMenuView;
import byui.cit260.hauntedHotels.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author scottbailey1234
 */
public class HauntedHotels {

    private static Game currentGame = null;
    private static Player player = null;  
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) { 

       
            try{
            // open charcter stream files for end user input and output
            HauntedHotels.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            HauntedHotels.outFile = new PrintWriter(System.out, true);
        
            // open log file
            String filePath = "log.txt";
            HauntedHotels.logFile = new PrintWriter(filePath);
            }
            catch(Exception e){
                System.out.println("ERROR");
            }
            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            try{
            startProgramView.display();
         
        } catch (Throwable e) {
              
                System.out.println("Exception: " + e.toString() + 
                                   "\nCause: " + e.getCause() + 
                                   "\nMessage: " + e.getMessage());

                e.printStackTrace();
                startProgramView.display();
        }

        finally {
            try {
                if (HauntedHotels.inFile != null)
                    HauntedHotels.inFile.close();
                
                if (HauntedHotels.outFile != null)
                    HauntedHotels.outFile.close();
                
                if (HauntedHotels.logFile != null)
                    HauntedHotels.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }   
        }
    }
        
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HauntedHotels.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HauntedHotels.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HauntedHotels.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HauntedHotels.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HauntedHotels.logFile = logFile;
    }


}

/*    public static PrintWriter getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static Object getGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setGame(Game g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Object getMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Object setMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

/*
package hauntedhotels;

import byui.cit260.hauntedHotels.model.Challenge;
import byui.cit260.hauntedHotels.model.Player;
import byui.cit260.hauntedHotels.enums.Actor;
import byui.cit260.hauntedHotels.model.Game; 
import byui.cit260.hauntedHotels.model.HotelLocation;
import byui.cit260.hauntedHotels.model.Map;
import byui.cit260.hauntedHotels.model.InventoryItems;
import byui.cit260.hauntedHotels.model.Scene;
import byui.cit260.hauntedHotels.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class HauntedHotels {

    private static Game currentGame = null;
    private static Player player = null;  
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    private static PrintWriter logFile = null;
    
    public static void main(String[] args) { 

        try {
            
            // open charcter stream files for end user input and output
            HauntedHotels.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));
            
            HauntedHotels.outFile = new PrintWriter(System.out, true);
        
            // open log file
            String filePath = "log.txt";
            HauntedHotels.logFile = new PrintWriter(filePath);


            // create StartProgramView and start the program
            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();
            return; 

        } catch (Throwable e) {
              
                System.out.println("Exception: " + e.toString() + 
                                   "\nCause: " + e.getCause() + 
                                   "\nMessage: " + e.getMessage());

                e.printStackTrace();;
        }

        finally {
            try {
                if (HauntedHotels.inFile != null)
                    HauntedHotels.inFile.close();
                
                if (HauntedHotels.outFile != null)
                    HauntedHotels.outFile.close();
                
                if (HauntedHotels.logFile != null)
                    HauntedHotels.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }   
        }
    }
        
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        HauntedHotels.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        HauntedHotels.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        HauntedHotels.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        HauntedHotels.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        HauntedHotels.logFile = logFile;
    }


}
*/
/*    public static PrintWriter getLogFile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public static Object getGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void setGame(Game g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Object getMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static Object setMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/


