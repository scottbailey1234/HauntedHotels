/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author scottbailey1234
 */
public class ChallengeControlTest {
    
    public ChallengeControlTest() {
    }

    /**
     * Test of calcDisplacement method, of class ChallengeControl.
     */
    @Test
    public void testCalcDisplacement() {
        System.out.println("calcDisplacement");
        
        /***********************
         * Test case #1
         **********************/
        
        double groupDiscount = 70;
        double rms = 8;
        ChallengeControl instance = new ChallengeControl();
        double expResult = -100;
 
        double result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
