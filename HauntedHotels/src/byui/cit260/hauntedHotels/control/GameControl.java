/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.control;

import byui.cit260.hauntedHotels.model.Game;
import byui.cit260.hauntedHotels.model.InventoryItems;
import byui.cit260.hauntedHotels.model.Map;
import byui.cit260.hauntedHotels.model.Player;
import hauntedhotels.HauntedHotels;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author scottbailey1234
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player p = new Player();
        p.setName(name);
        
//        HauntedHotels.setPlayer(player); // save the player
        
        return p;
    }

    public static void createNewGame(Player player) {
        Game g = new Game(); // create new game
        g.setPlayer(player); //save player in game
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        populateMapWithItems(gameMap);
        
        player.setLocation(gameMap.getLocation(0, 0));
        
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
                      
                if(map.getLocation(row, col).getHero() == null) {
                    map.getLocation(row, col).setItem(i);                
                    success = true;
                }
            
            } while(success ==false);
        
        }    
    
    }    
    
    public static List<InventoryItems> createItemList() {
        
        List<InventoryItems> itemList = new ArrayList<>();
        
        Item typewriter = new Item();
        typewriter.setDescription("All work and no play makes Jack a dull boy.");
        itemList.add(typewriter);
        
        return itemList;
        
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
    }
        public enum Item {
            spray,
            towels,
            sheets,
            vacuum,
            typewriter,
            calculator,
            phone,
            thermometer;            
        }
/*    private static InventoryItems[] createInventoryList() {
        InventoryItems[] inventory =
                new InventoryItems[15];
        InventoryItems spray = new InventoryItems();
        spray.setDescription("Spray");
        spray.setQuantityInStock(0);
        spray.setRequiredAmmount(0);
        inventory[Item.spray.ordinal()] = spray;
        
        return inventory;  
        
    
    }*/
}