
//the CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Tyler Day
// Date last modified: May 2018
//------------------------------------------------------------
package Control;
// To buyLand
// Purpose: To buy land
// Parameters: the price of land, the number of acres to buy
//	and a reference to a CropData object
// Returns: the total number of acres owned after the purchase
// Pre-conditions: bushels of wheat must be positive
// and 1 <= the number of acres owned, population must be greater than 10% of the total of 
// acresOwned and acresToBuy

import cityOfAaron.model.CropData;
import java.util.Random;


public class CropControl {
    //constants 
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    private static Random random = new Random();
    private static final int LOW_OFFERING = 0;
    private static final int HIGH_OFFERING = 100;
    
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData)
    {
        //if population  < totalAcres / 10, return -1 (not sure what to do with this one)
        int acresOwned = cropData.getAcresOwned();
        int acresAfterTransaction = acresOwned + acresToBuy;
        int population = cropData.getPopulation();
        
        if (population <= (acresAfterTransaction/10) )
            return -1;
        
        //if acresToBuy < 0, return -1
        if (acresToBuy < 0)
            return -1;
        
        //If wheatInStore < 0, return -1
        int wheatInStore = cropData.getWheatInStore();
        if (acresOwned < 0)
            return -1;
        
        int wheatPrice =random.nextInt(LAND_RANGE)+LAND_BASE;
        
        //if acresToBuy > wheatInStore / landPrice, return -1
        if (acresToBuy > acresOwned/wheatPrice)
            return -1;
        
        //totalAcres = acresToBuy + acresOwned (this has been simplified)
        acresOwned+=acresToBuy;
        cropData.setAcresOwned(acresOwned);
        
        //totalCost = acresToBuy * landPrice
        //remainingWheat  = wheatInStore - totalCost (both of these have been simplified and combined)
        wheatInStore-=(acresToBuy*wheatPrice);
        cropData.setWheatInStore(wheatInStore);
        
        //Return int remainingWheat (renamed and correctly coded)
        return wheatInStore;
    }
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
    public static int setOffering(int offering, CropData cropData){
        // if offering is negative, return -1
        if ( offering < LOW_OFFERING )
            return -1;
        // if offering is greater than 100, return -1
        if ( offering > HIGH_OFFERING )
            return -1;
        // return offering percentage
        return offering;
    }

}
