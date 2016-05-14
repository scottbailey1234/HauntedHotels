/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.model;

import java.util.Objects;

/**
 *
 * @author Acer
 */
public class RoomScene implements Serializable {
    
    private int roomNumber;
    private String roomBackgroundInfo;
    private int roomChallenge;
    private String blockedLocation;
    private String displaySymbol;

    public RoomScene() {
    }
    
    

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomBackgroundInfo() {
        return roomBackgroundInfo;
    }

    public void setRoomBackgroundInfo(String roomBackgroundInfo) {
        this.roomBackgroundInfo = roomBackgroundInfo;
    }

    public int getRoomChallenge() {
        return roomChallenge;
    }

    public void setRoomChallenge(int roomChallenge) {
        this.roomChallenge = roomChallenge;
    }

    public String getBlockedLocation() {
        return blockedLocation;
    }

    public void setBlockedLocation(String blockedLocation) {
        this.blockedLocation = blockedLocation;
    }

    public String getDisplaySymbol() {
        return displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.roomNumber;
        hash = 47 * hash + Objects.hashCode(this.roomBackgroundInfo);
        hash = 47 * hash + this.roomChallenge;
        hash = 47 * hash + Objects.hashCode(this.blockedLocation);
        hash = 47 * hash + Objects.hashCode(this.displaySymbol);
        return hash;
    }

    @Override
    public String toString() {
        return "RoomScene{" + "roomNumber=" + roomNumber + ", roomBackgroundInfo=" + roomBackgroundInfo + ", roomChallenge=" + roomChallenge + ", blockedLocation=" + blockedLocation + ", displaySymbol=" + displaySymbol + '}';
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
        final RoomScene other = (RoomScene) obj;
        if (this.roomNumber != other.roomNumber) {
            return false;
        }
        if (this.roomChallenge != other.roomChallenge) {
            return false;
        }
        if (!Objects.equals(this.roomBackgroundInfo, other.roomBackgroundInfo)) {
            return false;
        }
        if (!Objects.equals(this.blockedLocation, other.blockedLocation)) {
            return false;
        }
        if (!Objects.equals(this.displaySymbol, other.displaySymbol)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
