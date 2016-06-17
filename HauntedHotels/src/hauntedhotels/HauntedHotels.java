/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhotels;

import byui.cit260.hauntedHotels.model.Challenge;
import byui.cit260.hauntedHotels.model.Player;
import byui.cit260.hauntedHotels.model.Character;
import byui.cit260.hauntedHotels.model.Game; 
import byui.cit260.hauntedHotels.model.HotelLocation;
import byui.cit260.hauntedHotels.model.Map;
import byui.cit260.hauntedHotels.model.InventoryItems;
import byui.cit260.hauntedHotels.model.RoomScene;
import byui.cit260.hauntedHotels.view.StartProgramView;


/**
 *
 * @author scottbailey1234
 */
public class HauntedHotels {
    
    private static Game currentGame = null;

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
    private static Player player = null;
    
    public static void main(String[] args) {
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();        
    }
}

