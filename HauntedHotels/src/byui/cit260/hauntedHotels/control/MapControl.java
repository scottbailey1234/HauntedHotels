/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.control;

import byui.cit260.hauntedHotels.enums.Actor;
import byui.cit260.hauntedHotels.enums.SceneType;
import byui.cit260.hauntedHotels.exceptions.MapControlException;
import byui.cit260.hauntedHotels.model.Game;
import byui.cit260.hauntedHotels.model.HotelLocation;
import byui.cit260.hauntedHotels.model.Map;
import byui.cit260.hauntedHotels.model.Player;
import hauntedhotels.HauntedHotels;
import byui.cit260.hauntedHotels.model.Scene;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author scottbailey1234
 */
public class MapControl {

    public static Map createMap() {
        //crate map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScenes();
        
        // assign the different scenes to locations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }


    private static Scene[] createScenes() {
     
        Game game = HauntedHotels.getCurrentGame();

        Scene[] scenes = new Scene[SceneType.values().length];

        Scene startingScene = new Scene();
        startingScene.setDescription(
                  "Enter if you dare!");
        startingScene.setMapSymbol(" N1 ");
        startingScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startingScene;

        return scenes;
    }
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        HotelLocation[][] locations = map.getLocations();

        // start point
        locations[0][0].setScene(scenes[SceneType.napa207.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.napa207.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.start.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.napa208.ordinal()]);
      
        locations[9][9].setScene(scenes[SceneType.omni203.ordinal()]);
        
        
        HashMap<String, ArrayList<Point>> sceneLocations =  
                new HashMap<String, ArrayList<Point>>();
 

        // create list of scenes to be assigned to locations
        ArrayList<Point> towelCoordinates = new ArrayList<Point>();
        towelCoordinates.add(new Point(1,8));
        towelCoordinates.add(new Point(2,8));
        towelCoordinates.add(new Point(1,9));
        towelCoordinates.add(new Point(2,9));
        towelCoordinates.add(new Point(2,13));
        towelCoordinates.add(new Point(3,13));
        towelCoordinates.add(new Point(4,13));
        towelCoordinates.add(new Point(5,13));
        towelCoordinates.add(new Point(3,14));
        towelCoordinates.add(new Point(4,14));
        towelCoordinates.add(new Point(9,16));
        towelCoordinates.add(new Point(10,16));
        towelCoordinates.add(new Point(9,17));
        towelCoordinates.add(new Point(11,14));
        towelCoordinates.add(new Point(12,5));
        sceneLocations.put("Towel", towelCoordinates);


        ArrayList<Point> napa207Coordinates = new ArrayList<Point>();
        for (int row = 0; row < 20; row++) {
            napa207Coordinates.add(new Point(row,0));
        }
        
        ArrayList<Point> napa208Coordinates = new ArrayList<Point>();
        for (int col = 3; col < 11; col++) {
            napa208Coordinates.add(new Point(0,col));
        }




    
}
    public static void moveActorsToStartingLocation(Map map, Actor[] actors) 
            throws MapControlException {
        Game game = HauntedHotels.getCurrentGame();
        
        
    }


    
}
