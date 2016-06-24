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


/**
 *
 * @author scottbailey1234
 */
public class GameControl {

    public static Player createPlayer(String name) {
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        HauntedHotels.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        Game game = new Game(); // create new game
        HauntedHotels.setCurrentGame(game); // save in HauntedHotels
        
        game.setPlayer(player); //save player in game
        
        //create the inventory list and save in the game
        /*private InventoryItems[] inventory;
        private Player player;
        private String[] characters;
        private Map map;*/
        InventoryItems[] inventoryList =GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Map map = MapControl.createMap();
        game.setMap(map); // save map in game
        
        // move characters to starting pisition in the map
        MapControl.moveCharactersToStartingLocation(map);
    }
        public enum Item {
            spray,
            towels,
            sheets,
            vacuum,
            typewriter,
            calculatro,
            phone,
            thermometer;            
        }
    private static InventoryItems[] createInventoryList() {
        InventoryItems[] inventory =
                new InventoryItems[15];
        InventoryItems spray = new InventoryItems();
        spray.setDescription("Spray");
        spray.setQuantityInStock(0);
        spray.setRequiredAmmount(0);
        inventory[Item.spray.ordinal()] = spray;
        
        return inventory;  
        
    
    }
}