/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.control;

/**
 *
 * @author scottbailey1234
 */
public class ChallengeControl {

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
        double g = rms*groupDiscount;
        double p = 8*75;
        double differencePos = p-g;
        
        return diff;
    }
}
