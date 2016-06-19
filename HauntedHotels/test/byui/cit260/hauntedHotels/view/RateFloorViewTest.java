/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hauntedHotels.view;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class RateFloorViewTest {
    
    public RateFloorViewTest() {
    }

    /**
     * Test of doAction method, of class RateFloorView.
     */
    @Test
    public void testDoAction() {
        System.out.println("doAction");
        double percentBooked = 0.0;
        RateFloorView instance = new RateFloorView();
        boolean expResult = false;
        boolean result = instance.doAction(percentBooked);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class RateFloorView.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        RateFloorView instance = new RateFloorView();
        instance.display();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
