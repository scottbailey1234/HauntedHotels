/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.control;

import byui.cit260.hauntedHotels.enums.Actor;
import byui.cit260.hauntedHotels.enums.Direction;
import byui.cit260.hauntedHotels.enums.SceneType;
import byui.cit260.hauntedHotels.exceptions.MapControlException;
import byui.cit260.hauntedHotels.model.Game;
import byui.cit260.hauntedHotels.model.HotelLocation;
import byui.cit260.hauntedHotels.model.Map;
import byui.cit260.hauntedHotels.model.Player;
import hauntedhotels.HauntedHotels;
import byui.cit260.hauntedHotels.model.Scene;
import java.awt.Point;
import java.security.InvalidParameterException;
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
    /* public static void moveActorsToStartingLocation(Map map) 
                            throws MapControlException {
        Actor[] actors = Actor.values();
        // for every actor
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            MapControl.moveActorToLocation(actor, coordinates);
        }
        
    }

/*
    public static void moveActorsToStartingLocation(Map map, Actor[] actors) 
            throws MapControlException {
        Game game = HauntedHotels.getCurrentGame();
        
        
    }
*/   
    


    private static void moveActorToLocation(Actor actor, Point coordinates) 
                            throws MapControlException {
        
        Map map = HauntedHotels.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getNoOfRows() ||
            newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Can not move actor to location "
                                        + coordinates.x + ", " + coordinates.y
                                        + " because that location is outside "
                                        + " the bounds of the map.");
    }       

    }

        public static HotelLocation getLocation(Point coordinates) {
        return HauntedHotels.getCurrentGame().getMap().getLocations()[coordinates.x-1][coordinates.y-1];
    }

     public static Point moveActor(Actor actor, Direction direction, int distance) 
                            throws MapControlException {
        
        Point blockedLocation = null;
        
        if (actor == null  || direction == null  || distance < 1) {
            throw new InvalidParameterException("actor, direction or distance is invalid");
        }
        
        Game game = HauntedHotels.getCurrentGame();    
        Map map = HauntedHotels.getCurrentGame().getMap();
        Point currentPosition = game.getActorsLocation()[actor.ordinal()];
        Point newPosition = null;
        
        if (currentPosition == null) {
            throw new MapControlException("Actor is currently is not assigned "
                                          + "to a location");
        }
        
        int currentRow = currentPosition.x;
        int currentColumn = currentPosition.y;

        if (currentRow < 0  || currentRow >= map.getNoOfRows() ||
            currentColumn < 0  || currentColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Actor is currently in an invalid "
                                          + "location");
        }
        
        // get new position
        int newRow = currentPosition.x + (direction.getxIncrement() * distance);
        int newColumn = currentPosition.y + (direction.getyIncrement() * distance);
        
                   
        if (newRow < 0  || newRow >= map.getNoOfRows() ||
            newColumn < 0  || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Trying to move to a location "
                                          + "outside bounds of the map");
        }  
        
        
        // Check to see if the path is blocked
        boolean blocked = false;
        HotelLocation[][] locations = map.getLocations();
        
        int noOfRows = (newRow - currentRow) * direction.getxIncrement();
        int row = currentRow + direction.getxIncrement();      
        for (int i = 0; i < noOfRows; i++ ) {
            locations[row][currentColumn].setVisited(true);
            
            if (locations[row][currentColumn].getScene().isBlocked()){   
                blocked = true;
                newRow = row - direction.getxIncrement();
                blockedLocation = new Point(row+1, currentColumn+1);
                break;
            }
            
            row += direction.getxIncrement();
        }
        
        
        int noOfColumns = (newColumn - currentColumn) * direction.getyIncrement();
        int column = currentColumn + direction.getyIncrement();       
        for (int i = 0; i < noOfColumns; i++ ) {
            locations[currentRow][column].setVisited(true);

            if (locations[currentRow][column].getScene().isBlocked()){ 
                blocked = true;
                newColumn = column - direction.getyIncrement();
                blockedLocation = new Point(currentRow+1, column+1);
                break;
            }  
            column += direction.getyIncrement();
        } 
        
        
        if (currentRow != newRow || currentColumn != newColumn) {
            HotelLocation currentLocation = map.getLocations()[currentRow][currentColumn];
            currentLocation.removeActor(actor); // remove actor from old location

            // set actor to new location
            newPosition = new Point(newRow, newColumn);
//            MapControl.moveActorToLocation(Actor actor, Point coordinates);
        }

        
        return blockedLocation;
    }   
}
