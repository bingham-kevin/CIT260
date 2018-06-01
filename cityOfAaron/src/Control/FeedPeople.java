/*
 *the FeedPeople class - part of the control layer
// class contains all of the calculation methods for deciding how much food 
// will be set aside for the people
// Author: Tyler Day
// Date last modified: May 2018
 */
package Control;

// To FeedPeople
// Purpose: To set aside some grain to feed the city's population
// Parameters: the amount of wheat input by a user to set aside
//	and a reference to a CropData object
// Returns: the total wheat remaining after setting aside a portion
// Pre-conditions: bushels of wheat must be positive
// and wheat set aside must be positive, and less than the total amount of wheat
import cityOfAaron.model.CropData;

public class FeedPeople {
    //constants
    
    public static int feedPeople(int userWheat, CropData cropData) {
        int wheatInStore = cropData.getWheatInStore();
        //If userWheat < 0, return Error, 
        if (userWheat < 1){
            return -1;
        }
        //Else, if userWheat > wheatInStore, return error
        if (userWheat > wheatInStore){
            return -1;
        }
        //Else, wheatInStore = wheatInStore-userWheat
        wheatInStore-=userWheat;
        cropData.setWheatInStore(wheatInStore);
        return wheatInStore;
        
        
    }
}
