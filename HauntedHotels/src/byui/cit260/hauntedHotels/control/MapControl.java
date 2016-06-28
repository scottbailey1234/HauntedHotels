/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.control;

import byui.cit260.hauntedHotels.model.Map;
import byui.cit260.hauntedHotels.model.Player;
import javafx.scene.Scene;

/**
 *
 * @author scottbailey1234
 */
public class MapControl {

    public static Map createMap() {
        //crate map
        Map map = new Map(20, 20);
        
        // create a list of the different scenes in the game
        Scene[] scenes = createScene();
        
        // assign the different scenes to lofations in the map
        assignScenesToLocations(map, scenes);
        
        return map;
    }


    private static Scene[] createScene() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void moveActorsToStartingLocation(Map map, Player[] actors) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
