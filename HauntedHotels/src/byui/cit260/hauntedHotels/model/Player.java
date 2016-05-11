/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author scottbailey1234
 */
public class Player implements Serializable{
    
    // class instance variables
    private String name;
    private double challengesSolved;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChallengesSolved() {
        return challengesSolved;
    }

    public void setChallengesSolved(double challengesSolved) {
        this.challengesSolved = challengesSolved;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.challengesSolved) ^ (Double.doubleToLongBits(this.challengesSolved) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", challengesSolved=" + challengesSolved + '}';
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
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.challengesSolved) != Double.doubleToLongBits(other.challengesSolved)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }


    
    
}
