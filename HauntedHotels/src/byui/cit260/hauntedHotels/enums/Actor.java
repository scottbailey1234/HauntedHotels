/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.enums;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author scottbailey1234
 */
public enum Actor implements Serializable {
    
    Manager("Manages the hotel"),
    Scientist("Paranormal scientist"),
    Psychic("Sees paranormal things"),
    Guest("Hotel guest");
    
    private final String description;
    
    Actor(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }   

    public void getCoordinates() {
        System.out.println("\n getCoordinates function called");
    }
    
}

