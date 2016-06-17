/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.control;

import java.util.Scanner;

/**
 *
 * @author scottbailey1234
 */
public class ChallengeControl {

    // calculate Displacement
    public double calcDisplacement(double groupDiscount, double rms) {

        if (groupDiscount < 40 || groupDiscount >= 75) { // discount is out of range?
                return -1;
        }        
                         
        if (rms <1 || rms >10) { // individual room entry is out of range?
                return -1;
        }     
        
        double g = 10*groupDiscount;
        double p = rms*75;
        double diff = (p-g);
        
        return diff;
    }
        
    // calculate Revpar    
    public double calcRevpar(double totRev) {
        
        if (totRev < 1 || totRev > 100000000) { // total revenue is out of range?
                return -1;
        }

        double r = 365 * 100;
        double revpar = totRev / r;
        
        return revpar;

    }
    
    public double rateFloor(double percentBook){
        if (percentBook < 0 || percentBook >100) {
            return -1;
        }

        double floorRate = ((100 * 70) * (percentBook / 100))/100;
        
        return floorRate;
            
    }

}