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


/**
 *
 * @author scottbailey1234
 */
public class HauntedHotels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setChallengesSolved(25);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        Character characterOne = new Character();
        
        characterOne.setName("Superman");
        characterOne.setDescription("Flies through the air with the greatest of ease.");
        characterOne.setCoordinates(10);
                        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        
        Game gameOne = new Game();
        
        gameOne.setTotalChallenges(25);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        
        Map gameMap = new Map();
        
        gameMap.setRowCount(50);
        gameMap.setColumnCount(50);
        
        String mapInfo = gameMap.toString();
        System.out.println(mapInfo);
        
        
        InventoryItems gameInventory = new InventoryItems();
        
        gameInventory.setInventoryType("Typewriter");
        gameInventory.setInventoryDescription("All work and no play makes Jack a dull boy.");
        
        String inventoryInfo = gameInventory.toString();
        System.out.println(inventoryInfo);
        
        Challenge challengeOne = new Challenge();
        
        challengeOne.setChallengeName("Puzzle1");
        challengeOne.setChallengeType("Puzzle");
        challengeOne.setChallengeProblem("Some text here");
        challengeOne.setChallengeSolution("Answer to the problem");
        
        String challengeInfo = challengeOne.toString();
        System.out.println(challengeInfo);
        
        RoomScene roomSceneOne = new RoomScene();
        
        roomSceneOne.setRoomNumber(12);
        roomSceneOne.setRoomBackgroundInfo("This room is a penthouse");
        roomSceneOne.setRoomChallenge(20);
        roomSceneOne.setBlockedLocation("Names of blocked locations");
        roomSceneOne.setDisplaySymbol("Image representing a location");
        
        String roomSceneInfo = roomSceneOne.toString();
        System.out.println(roomSceneInfo);
        
        
        HotelLocation location = new HotelLocation();
        
        location.setRow(15);
        location.setColumn(20);
        location.setVisited(20);
        location.setAmountRemaining(5);
        
        String locationInfo = location.toString();
        System.out.println(locationInfo);
        
    }
}

