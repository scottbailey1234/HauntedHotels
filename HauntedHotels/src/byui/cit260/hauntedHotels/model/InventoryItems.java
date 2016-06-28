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

public class InventoryItems implements java.io.Serializable {
    
    private String description;


    public InventoryItems() {
    }

    public InventoryItems(String description, double quantityInStock, double requiredAmount) {
        this.description = description;
    }


    @Override
    public String toString() {
        return description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItems other = (InventoryItems) obj;
        return true;
    }

    public void setItem(String all_work_and_no_play_makes_Jack_a_dull_bo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
/*public class InventoryItems implements Serializable {
    
    //class instance variables
    private String inventoryType;
    private String inventoryDescription;

    
    public InventoryItems() {
    }
   
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getInventoryDescription() {
        return inventoryDescription;
    }

    public void setInventoryDescription(String inventoryDescription) {
        this.inventoryDescription = inventoryDescription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.inventoryType);
        hash = 59 * hash + Objects.hashCode(this.inventoryDescription);
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItems{" + "inventoryType=" + inventoryType + ", inventoryDescription=" + inventoryDescription + '}';
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
        final InventoryItems other = (InventoryItems) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.inventoryDescription, other.inventoryDescription)) {
            return false;
        }
        return true;
    }


    public Object getDescription() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
*/

