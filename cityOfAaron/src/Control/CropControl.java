
//the CropControl class - part of the control layer
// class contains all of the calculation methods for managing the crops
// Author: Tyler Day
// Date last modified: May 2018
//------------------------------------------------------------
package Control;

import Exception.CropException;
import Model.CropData;
import java.util.Random;


public class CropControl {
    //constants 
    private static final int LAND_BASE = 17;
    private static final int LAND_RANGE = 10;
    private static Random random = new Random();
    private static final int LOW_OFFERING = 0;
    private static final int HIGH_OFFERING = 100;
    private static final int ACRES_PER_BUSHEL = 2;
    
    // To buyLand
    // Purpose: To buy land
    // Parameters: the price of land, the number of acres to buy
    //	and a reference to a CropData object
    // Returns: the total number of acres owned after the purchase
    // Pre-conditions: bushels of wheat must be positive
    // and 1 <= the number of acres owned, population must be greater than 10% of the total of 
    // acresOwned and acresToBuy
    public static void buyLand(int landPrice, int acresToBuy, CropData cropData) throws CropException{
        int acresOwned = cropData.getAcresOwned();
        int acresAfterTransaction = acresOwned + acresToBuy;
        int population = cropData.getPopulation();
        
        //if population  < totalAcres / 10, return -1 (not sure what to do with this one)
        if (population < (acresAfterTransaction/10) )
            throw new CropException("You do not have enough people to tend the land.");
        
        //if acresToBuy < 0, return error
        if (acresToBuy < 0)
            throw new CropException("A negative value was input");
        
        //If wheatInStore < 0, return error
        int wheat = cropData.getWheatInStore();
        if (acresOwned < 0)
            throw new CropException("There is insufficient wheat to buy this much land");
        
        int wheatPrice = random.nextInt(LAND_RANGE)+LAND_BASE;
        
        //if acresToBuy > wheatInStore / landPrice, return error
        if (acresToBuy > acresOwned/wheatPrice)
            throw new CropException("You do not have enough wheat to buy this much land.");
        
        //totalAcres = acresToBuy + acresOwned (this has been simplified)
        acresOwned+=acresToBuy;
        cropData.setAcresOwned(acresOwned);
        
        //totalCost = acresToBuy * landPrice
        //remainingWheat  = wheatInStore - totalCost (both of these have been simplified and combined)
        wheat-=(acresToBuy*wheatPrice);
        cropData.setWheatInStore(wheat);
        
        //Return int remainingWheat (renamed and correctly coded)
        cropData.setWheatInStore(wheat);
    }
     /* The sellLand class - part of the control layer
      * class to sell land
      * Author: Kevin Bingham
      * Date last modified: June 2018
      */
    
     /* To sellLand
      * Purpose: to sell land
      * Parameters: the price of land, the number of acres to sell, and
      * a reference to a CropData object
      * Returns: the acres owned after the sale
      * Pre-conditions: acres to sell must be positive
      * and <= acresOwned
      */
    public static int sellLand(int landPrice, int acresToSell, CropData cropData){
        int acresOwned = cropData.getAcresOwned();
        
        //If acresToSell is negative, return -1
        if (acresToSell < 0)
            return -1;
        
        //if acresToSell is > than acresOwned, return -1
        if (acresToSell > acresOwned)
            return -1;
        
        acresToSell-=acresOwned;
        cropData.setAcresOwned(acresOwned);
        
        int wheatPrice = random.nextInt(LAND_RANGE)+LAND_BASE;
        int wheat = cropData.getWheatInStore();
        
        wheat+=(acresToSell * wheatPrice);
        cropData.setWheatInStore(wheat);
              
        return acresOwned;
    }
     /* the FeedPeople class - part of the control layer
      * class contains all of the calculation methods for deciding how much food 
      * will be set aside for the people
      * Author: Tyler Day
      * Date last modified: May 2018
      */
    
    // To FeedPeople
    // Purpose: To set aside some grain to feed the city's population
    // Parameters: the amount of wheat input by a user to set aside
    //	and a reference to a CropData object
    // Returns: the total wheat remaining after setting aside a portion
    // Pre-conditions: bushels of wheat must be positive
    // and wheat set aside must be positive, and less than the total amount of wheat
    public static void feedPeople(int userWheat, CropData cropData)throws CropException{
        int wheatInStore = cropData.getWheatInStore();
        
        //If userWheat < 0, return Error, 
        if (userWheat < 0){
            throw new CropException("You entered a negative number.");
        }
        
        //Else, if userWheat > wheatInStore, return error
        if (userWheat > wheatInStore){
            throw new CropException("You do not have enough wheat.");
        }
        
        //Else, wheatInStore = wheatInStore-userWheat
        wheatInStore-=userWheat;
        cropData.setWheatInStore(wheatInStore);
    }
    /** The SetOffering class - part of the control layer
      * class sets the percentage that will be offered
      * Author: Kevin Bingham
      * Date last modified: May 2018
      */
    
     /* To setOffering
      * Purpose: Set offering percentage
      * Parameters: Percentage to offer
      * Pre-conditions: Percentage must be positive
      * and equal to or less than 100
      */
    public static void setOffering(int offering, CropData cropData)throws CropException{
        // check offering parameters - do they meet requirements
        if ( offering < LOW_OFFERING )
            throw new CropException("A negative number was input.");

        if ( offering > HIGH_OFFERING )
            throw new CropException("A number greater than 100 was input.");
        // return offering percentage
        cropData.setOffering(offering);
    }
    
    // payOffering
    public static int payOffering(int harvest, int offering, CropData cropData ){
        int wheatInStore = cropData.getWheatInStore();
        
        //if harvest is negative, return -1
        if ( harvest < 0)
            return -1;
        //if offering is negative, return -1
        if ( offering < 0 )
            return -1;
        //calculate offeringBushels
        int offeringBushels = harvest * offering;
        //calculate harvestAfterOffering
        int harvestAfterOffering = harvest - offeringBushels;
        //add harvestAfterOffering to wheatInStore
        wheatInStore+=harvestAfterOffering;
        //save total wheatInStore back to setWheatInStore method
        cropData.setWheatInStore(wheatInStore);
        //return harvested bushels after paying 
        return harvestAfterOffering;
    }

    // calcLandCost() method
    // Purpose: Calculate a random land cost between 17 and 26 bushels/acre
    // Parameters: none
    // Returns: the land cost
    public static int calcLandCost(){
          int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;  
          return landPrice;            
     }
    
    // plantCrops() method
    // Purpose: Calculate the acres of land to plant
    // Parameters: Number of acres to plant inout by the user
    // and a reference to a CropData object
    // Pre-condtions: acres to plant must be positive, must be less than the
    // acres owned by the city, and must have enough wheat to per acre for 
    // planting
    public static int plantCrops(int acresToPlant, CropData cropData){
        int acresOwned = cropData.getAcresOwned();
        int wheat = cropData.getWheatInStore();
        
        // if acres to plant is negative, return -1
        if (acresToPlant < 0)
            return -1;
        
        // if acres to plant is greater than acres owned, return -1
        if (acresToPlant > acresOwned)
            return -1;
        
        int wheatNeededToPlant = acresToPlant * wheat;
        
        // if wheat is less than wheatNeededToPlant, return -1
        if (wheat < wheatNeededToPlant)
            return -1;
        
        // calculate wheat used
        int bushelsUsed = acresToPlant * ACRES_PER_BUSHEL;
        wheat-=bushelsUsed;
        
        cropData.setWheatInStore(wheat);
        
        // return acres planted
        return acresToPlant;
    }
}
