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
        
        /*******************
         * Test Case #1
         ******************/
        System.out.println("\tTest Case Valid #1");
        
        //input values for test case 1
        double groupDiscount = 70;
        double rms = 8;
        
        //create instance of InventoryControl class
        ChallengeControl instance = new ChallengeControl();
        
        //expected output returned value
        double expResult = -100;
        
        //call function to run test
        double result = instance.calcDisplacement(groupDiscount, rms);
       
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);

        
        /*******************
         * Test Case #2
         ******************/
        
        System.out.println("\tTest Case Invalid #2");

        //input values for test case 2
        groupDiscount = 80;
        rms = 5;
        
        //expected output returned value
        expResult = -1;
        
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
       
        
        /*******************
         * Test Case #3
         ******************/
        
        System.out.println("\tTest Case Invalid #3");

        //input values for test case 3
        groupDiscount = 20;
        rms = 10;
        
        //expected output returned value
        expResult = -1;
        
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * Test Case #4
         ******************/
        
        System.out.println("\tTest Case Invalid #4");

        //input values for test case 4
        groupDiscount = 70;
        rms = 0;
        
        //expected output returned value
        expResult = -1;
        
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * Test Case #5
         ******************/
        
        System.out.println("\tTest Case Invalid #5");

        //input values for test case 5
        groupDiscount = 60;
        rms = 12;
        
        //expected output returned value
        expResult = -1;
        
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * Test Case #6
         ******************/
        
        System.out.println("\tTest Case Boundry #6");

        //input values for test case 6
        groupDiscount = 40;
        rms = 1;
        
        //expected output returned value
        expResult = -325;
        
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * Test Case #7
         ******************/
        
        System.out.println("\tTest Case Boundry #7");

        //input values for test case 7
        groupDiscount = 74;
        rms = 10;
        
        //expected output returned value
        expResult = 10;
        
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * Test Case #8
         ******************/
        
        System.out.println("\tTest Case Boundry #8");

        //input values for test case 8
        groupDiscount = 74;
        rms = 1;
        
        //expected output returned value
        expResult = -665;
        
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
        
        
        /*******************
         * Test Case #9
         ******************/
        
        System.out.println("\tTest Case Boundry #9");

        //input values for test case 9
        groupDiscount = 40;
        rms = 10;
        
        //expected output returned value
        expResult = 350;
        
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        
        //compare expected return value with actual value returned
        assertEquals(expResult, result, 0.0);
    }
    
}
