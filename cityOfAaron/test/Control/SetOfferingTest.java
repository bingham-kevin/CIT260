/**
 * Test SetOffering class functions
 * Author Kevin Bingham
 * Date last modified: May 2018
 */
package Control;

import cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

public class SetOfferingTest {
    
    public SetOfferingTest() {
    }

    /**
     * Test of setOffering method, of class SetOffering.
     */
    @Test
    public void testSetOfferingOne() {
        System.out.println("setOfferingOne");
        int offering = 10;
        CropData cropData = null;
        int expResult = 10;
        int result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
    }
    @Test
    public void testSetOfferingTwo() {
        System.out.println("setOfferingTwo");
        int offering = 101;
        CropData cropData = null;
        int expResult = -1;
        int result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
    }

    @Test
    public void testSetOfferingThree() {
        System.out.println("setOfferingThree");
        int offering = -3;
        CropData cropData = null;
        int expResult = -1;
        int result = CropControl.setOffering(offering, cropData);
        assertEquals(expResult, result);
    }
    
}
