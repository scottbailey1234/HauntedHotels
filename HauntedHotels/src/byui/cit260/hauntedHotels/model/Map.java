/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.model;

/**
 *
 * @author scottbailey1234
 */public class Map implements java.io.Serializable {
    
    private int noOfRows;
    private int noOfColumns;
    private HotelLocation[][] locations;

    public Map() {     
    }
    
    public Map(int noOfRows, int noOfColumns) {
        
        if (noOfRows < 1 || noOfColumns < 1) {
            System.out.println("The number of rows and columns must be > zero");
            return;
        }
        
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        
        // create 2-D array for Location objects
        this.locations = new HotelLocation[noOfRows][noOfColumns];
        
        for (int row = 0; row < noOfRows; row++) {
            for(int column = 0; column < noOfColumns; column++) {
                // create and initialize new Location object instance
                HotelLocation location = new HotelLocation();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                // assign the Location object to the current position in array
                locations[row][column] = location;          
            }
        }
    }

    
    
    public long getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public long getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }

    public HotelLocation[][] getLocations() {
        return locations;
    }

    public void setLocations(HotelLocation[][] locations) {
        this.locations = locations;
    }
    
    
    

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + noOfRows + ", columnCount=" + noOfColumns + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + (int) (this.noOfRows ^ (this.noOfRows >>> 32));
        hash = 37 * hash + (int) (this.noOfColumns ^ (this.noOfColumns >>> 32));
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
        final Map other = (Map) obj;
        if (this.noOfRows != other.noOfRows) {
            return false;
        }
        if (this.noOfColumns != other.noOfColumns) {
            return false;
        }
        return true;
    }
    
    
    
}
/*
public class Map /*implements Serializable {
    
   private double rowCount;
   private double columnCount;
    
    public static final int NUM_ROWS = 5;
    public static final int NUM_COLS = 5;
    
    private HotelLocation[][] matrix;

    public Map(){
        matrix = new HotelLocation[NUM_ROWS][NUM_COLS];
        init();
    }

    public Map(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void init() {
        
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                HotelLocation loc = new HotelLocation();
                
                //Create a random location type
                loc.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);
                
                matrix[row][col] = loc;
            }
        }
    }
    
    public String getMapString() {
        
        String rtn = "";
        
        for (int row = 0; row < NUM_ROWS; row++) {
            for (int col = 0; col < NUM_COLS; col++) {
                rtn += matrix[row][col].getType().name().charAt(0);
                
                if(matrix[row][col].getItem() != null) {
                    rtn += matrix[row][col].getType().name().charAt(0) + "\t";
                }
                
                rtn += "\t";
                
            }
            rtn += "\n";
        }
        
        return rtn;
    }
    
    public HotelLocation getLocation(int row, int col) {
        return matrix[row][col];
    }
---    
    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }

    private void init() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
*/    

