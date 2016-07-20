/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.control;

import byui.cit260.hauntedHotels.enums.Actor;
import byui.cit260.hauntedHotels.enums.Item;
import byui.cit260.hauntedHotels.exceptions.GameControlException;
import byui.cit260.hauntedHotels.exceptions.MapControlException;
import byui.cit260.hauntedHotels.model.Game;
import byui.cit260.hauntedHotels.model.HotelLocation;
import byui.cit260.hauntedHotels.model.InventoryItems;
import byui.cit260.hauntedHotels.model.Map;
import byui.cit260.hauntedHotels.model.Player;
import byui.cit260.hauntedHotels.model.Scene;
import hauntedhotels.HauntedHotels;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collections;


/**
 *
 * @author scottbailey1234
 */
public class GameControl {
    private Map map;
    public GameControl() {
    }
    
    public static void createNewGame(Player player) 
            throws MapControlException {
        
       Game game = new Game(); // create new game
       HauntedHotels.setCurrentGame(game); // save in CuriousWorkmanship
       
       game.setPlayer(player); // save player in game
                 
       Map map = MapControl.createMap(); // create and initialize new map
       game.setMap(map); // save map in game

       // move actors to starting position in the map
       Actor[] actors = Actor.values();
       
//       MapControl.moveActorsToStartingLocation(map, map);    
    }    

    
    public static InventoryItems[] createInventoryList() {
        // created array(list) of inventory items    
        InventoryItems[] inventory = 
            new InventoryItems[Constants.NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItems typewriter = new InventoryItems();
        typewriter.setDescription("Typewriter");
        inventory[Item.typewriter.ordinal()] = typewriter;
    
        return inventory;
    }

    public static HotelLocation[][] getMapLocations() {
        return HauntedHotels.getCurrentGame().getMap().getLocations();
    }
    
    
    public static InventoryItems[] getInventory() {
        return HauntedHotels.getCurrentGame().getInventory();
    } 

// Scott Individual Assignment  
    public Actor[]  getSortActorList(Actor[] actors) {
        
        // using a BubbleSort to sort the list of actors by name
        Actor tempActor;
        for (int i = 0; i < actors.length-1; i++) {
            for (int j = 0; j < actors.length-1-i; j++) {
                String currentActorsName = actors[j].toString();
                String nextActorsNames = actors[j + 1].toString();
                if ( currentActorsName.compareToIgnoreCase(nextActorsNames) > 0) {
                    tempActor = actors[j];
                    actors[j] = actors[j+1];
                    actors[j+1] = tempActor;
                }
            }
        }
        
        return actors;
    }
    
    public Scene[]  getSortSceneList(Scene[] scenes) {
        
        // using a BubbleSort to sort the list of scenes by name
        Scene tempScene;
        for (int i = 0; i < scenes.length-1; i++) {
            for (int j = 0; j < scenes.length-1-i; j++) {
                String currentActorsName = scenes[j].toString();
                String nextActorsNames = scenes[j + 1].toString();
                if ( currentActorsName.compareToIgnoreCase(nextActorsNames) > 0) {
                    tempScene = scenes[j];
                    scenes[j] = scenes[j+1];
                    scenes[j+1] = tempScene;
                }
            }
        }
        
        return scenes;
    }
        public static void saveGame(Game game, String filepath) 
            throws GameControlException {

        try( FileOutputStream fops = new FileOutputStream(filepath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game); // write the game object out to file
        }
        catch(IOException e) {
            throw new GameControlException(e.getMessage());
        } 
    }

    
    public static void getSavedGame(String filepath) 
                        throws GameControlException {
        Game game = null;

        try( FileInputStream fips = new FileInputStream(filepath)) {
            ObjectInputStream output = new ObjectInputStream(fips);
            
            game = (Game) output.readObject(); // read the game object from file
        }
        catch(FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }

       // close the outuput file
       HauntedHotels.setCurrentGame(game); // save in HauntedHotels
    }
}
    
    // Victor Individual Assignment
/*        public static void sortAlphabetically() {
        
        Character[] values = Character.values();
         Collections.sort(values); 
         for(Character value: values)
            System.out.println(value);
    }
}*/
/*
    public static InventoryItems[] getSortedInventoryList() {
        
        // get inventory list for the current game
        InventoryItems[] originalInventoryList = 
                HauntedHotels.getCurrentGame().getInventory();
        
        // clone (make a copy) orignalList
        InventoryItems[] inventoryList = originalInventoryList.clone();
        
       // using a BubbleSort to sort the list of inventoryList by name
        InventoryItems tempInventoryItem;
        for (int i = 0; i < inventoryList.length-1; i++) {
            for (int j = 0; j < inventoryList.length-1-i; j++) {
                if (inventoryList[j].getDescription().
                        compareToIgnoreCase(inventoryList[j + 1].getDescription()) > 0) {
                    tempInventoryItem = inventoryList[j];
                    inventoryList[j] = inventoryList[j+1];
                    inventoryList[j+1] = tempInventoryItem;
                }
            }
        }
        
        return inventoryList;
    }*/


/*
    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player p = new Player();
        p.setName(name);
        
//        HauntedHotels.setPlayer(player); // save the player
        
        return p;
    }

/*    public static void createNewGame(Player player) {
        Game g = new Game(); // create new game
        g.setPlayer(player); //save player in game
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        populateMapWithItems(gameMap);
        
        player.setLocation(gameMap.getHotelLocation(0, 0));
        
        HauntedHotels.setGame(g);
        
    }
     
    public static void populateMapWithItems (Map map) {
        
        List<InventoryItems> items = createItemList();
        boolean success = false;
           
        for(InventoryItems i : items) {
            
            do {
                       
                int row = ((int) Math.random() * Map.NUM_ROWS);
                int col = ((int) Math.random() * Map.NUM_COLS);
                
                    success = false;
                      
                if(map.getLocation(row, col).getCharacter() == null) {
                    map.getLocation(row, col).setItem(i);                
                    success = true;
                }
            
            } while(success ==false);
        
        }    
    
    }    
    

    public static List<InventoryItems> createItemList() {
        
        List<InventoryItems> itemType = new ArrayList<>();
        
        InventoryItems typewriter = new InventoryItems();
        typewriter.setItem("All work and no play makes Jack a dull boy.");
        itemType.add(typewriter);
        
        return itemType;
        
    }
//new victor        HauntedHotels.setCurrentGame(game); // save in HauntedHotels
        
      
        //create the inventory list and save in the game
        /*private InventoryItems[] inventory;
        private Player player;
        private String[] characters;
        private Map map;*/
//new victor        InventoryItems[] inventoryList =GameControl.createInventoryList();
//new victor        game.setInventory(inventoryList);
        
//new victor        Map map = MapControl.createMap();
//new victor        game.setMap(map); // save map in game
        
        // move characters to starting pisition in the map
//new victor        MapControl.moveCharactersToStartingLocation(map);


/*    private static InventoryItems[] createInventoryList() {
        InventoryItems[] inventory =
                new InventoryItems[15];
        InventoryItems spray = new InventoryItems();
        spray.setDescription("Spray");
        spray.setQuantityInStock(0);
        spray.setRequiredAmmount(0);
        inventory[Item.spray.ordinal()] = spray;
        
        return inventory;  
        
    
    }

    private static List<InventoryItems> createItemList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static HotelLocation[][] getMapLocations() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
