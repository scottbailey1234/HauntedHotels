/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.model;

import java.awt.Point;


/**
 *
 * @author scottbailey1234
 */
public enum Character implements Serializable{
    
    Manager("Manages the hotel"),
    Scientist("Paranormal scientist"),
    Psychic("Sees paranormal things"),
    Guest("Hotel guest");
    
    // class instance variables
    //private String name;
    private final String description;
    private final Point coordinates;

    Character(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }

    
    /*public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }*/

    public String getDescription() {
        return description;
    }

    /*public void setDescription(String description) {
        this.description = description;
    }*/

    public Point getCoordinates() {
        return coordinates;
    }

   /*public void setCoordinates(double coordinates) {
        this.coordinates = coordinates;
    }*/

    /*@Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.coordinates) ^ (Double.doubleToLongBits(this.coordinates) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (Double.doubleToLongBits(this.coordinates) != Double.doubleToLongBits(other.coordinates)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }*/

}
