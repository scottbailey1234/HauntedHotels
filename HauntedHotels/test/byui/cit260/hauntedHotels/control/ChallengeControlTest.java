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
 * @author Acer
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
        
        /****************************
         * Test case #1
         ***************************/
        System.out.println("\tTest case #1");
        
        //input values for test case 1
        double groupDiscount = 70.0;
        double rms = 10.0;
       
        double expResult = -100.0; // expected output returned value
        
        //create instance of InventoryControl class
        ChallengeControl instance = new ChallengeControl();
        
        //call function to run test
        double result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
         /****************************
         * Test case #2
         ***************************/
        System.out.println("\tTest case #2");
        
        //input values for test case 1
        groupDiscount = 80.0;
        rms = 5.0;
       
        expResult = -1; // expected output returned value
        
        //create instance of InventoryControl class
                
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /****************************
         * Test case #3
         ***************************/
        System.out.println("\tTest case #3");
        
        //input values for test case 1
        groupDiscount = 20.0;
        rms = 10.0;
       
        expResult = -1; // expected output returned value
        
        //create instance of InventoryControl class
                
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
        
        /****************************
         * Test case #4
         ***************************/
        System.out.println("\tTest case #4");
        
        //input values for test case 1
        groupDiscount = 70.0;
        rms = 0.0;
       
        expResult = -1; // expected output returned value
        
        //create instance of InventoryControl class
                
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
        
        /****************************
         * Test case #5
         ***************************/
        System.out.println("\tTest case #5");
        
        //input values for test case 1
        groupDiscount = 60.0;
        rms = 12.0;
       
        expResult = -1; // expected output returned value
        
        //create instance of InventoryControl class
                
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
        
        /****************************
         * Test case #6
         ***************************/
        System.out.println("\tTest case #6");
        
        //input values for test case 1
        groupDiscount = 40.0;
        rms = 1.0;
       
        expResult = 560; // expected output returned value
        
        //create instance of InventoryControl class
                
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
        
        /****************************
         * Test case #7
         ***************************/
        System.out.println("\tTest case #7");
        
        //input values for test case 1
        groupDiscount = 74.0;
        rms = 10.0;
       
        expResult = -140; // expected output returned value
        
        //create instance of InventoryControl class
                
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
        
        /****************************
         * Test case #8
         ***************************/
        System.out.println("\tTest case #8");
        
        //input values for test case 1
        groupDiscount = 74.0;
        rms = 1.0;
       
        expResult = 526; // expected output returned value
        
        //create instance of InventoryControl class
                
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
        
        /****************************
         * Test case #9
         ***************************/
        System.out.println("\tTest case #9");
        
        //input values for test case 1
        groupDiscount = 40.0;
        rms = 10.0;
       
        expResult = 200; // expected output returned value
        
        //create instance of InventoryControl class
                
        //call function to run test
        result = instance.calcDisplacement(groupDiscount, rms);
        assertEquals(expResult, result, 0.001);
    }
    
}
