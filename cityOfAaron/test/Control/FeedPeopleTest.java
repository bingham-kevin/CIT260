/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import cityOfAaron.model.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mjd12
 */
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
        fail("something went wrong here");
    }
    public void testFeedPeopleErrorOne() {
        System.out.println("feedPeople");
        int userWheat = 250;
        CropData cropData = new CropData();
        cropData.setWheatInStore(000);
        int expResult = -1;
        int result = FeedPeople.feedPeople(userWheat, cropData);
        assertEquals(expResult, result);
        fail("something went wrong here");
    }
    public void testFeedPeopleErrorTwo() {
        System.out.println("feedPeople");
        int userWheat = -200;
        CropData cropData = new CropData();
        cropData.setWheatInStore(1000);
        int expResult = -1;
        int result = FeedPeople.feedPeople(userWheat, cropData);
        assertEquals(expResult, result);
        fail("something went wrong here");
    }
    
}
