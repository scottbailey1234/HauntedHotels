/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.model;

import java.util.Objects;

/**
 *
 * @author scottbailey1234
 */
public class Game implements Serializable {
    
    //class instance variables
    private double totalChallenges;

    public Game() {
    }
    

    public double getTotalChallenges() {
        return totalChallenges;
    }

    public void setTotalChallenges(double totalChallenges) {
        this.totalChallenges = totalChallenges;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.totalChallenges) ^ (Double.doubleToLongBits(this.totalChallenges) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Game{" + "totalChallenges=" + totalChallenges + '}';
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalChallenges) != Double.doubleToLongBits(other.totalChallenges)) {
            return false;
        }
        return true;
    }


}
