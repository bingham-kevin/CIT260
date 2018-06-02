/**
 * Test FeedPeople class functions
 * Author Tyler Day
 * Date last modified: May 2018
 */
package Control;

import cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

public class FeedPeopleTest {
    
    public FeedPeopleTest() {
    }

    /**
     * Test of feedPeople method, of class FeedPeople.
     */
    
    @Test
    public void testFeedPeople() {
        System.out.println("feedPeople");
        int userWheat = 250;
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        int expResult = 750;
        int result = FeedPeople.feedPeople(userWheat, cropData);
        assertEquals(expResult, result);
        // fail("something went wrong here");
    }
    @Test
    public void testFeedPeopleErrorOne() {
        System.out.println("feedPeople");
        int userWheat = 250;
        CropData cropData = new CropData();
        cropData.setWheatInStore(000);
        int expResult = -250;
        int result = FeedPeople.feedPeople(userWheat, cropData);
        assertEquals(expResult, result);
    }
    @Test
    public void testFeedPeopleErrorTwo() {
        System.out.println("feedPeople");
        int userWheat = -200;
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        int expResult = 1200;
        int result = FeedPeople.feedPeople(userWheat, cropData);
        assertEquals(expResult, result);
    }
    
}
