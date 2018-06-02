// the SetOffering class - part of the control layer
// class sets the percentage that will be offered
// Author: Kevin Bingham
// Date last modified: May 2018

package Control;

// To setOffering
// Purpose: Set offering percentage
// Parameters: Percentage to offer
// Pre-conditions: Percentage must be positive
// and equal to or less than 100

import cityOfAaron.model.CropData;


public class SetOffering {
    //constants
    private static final int LOW_OFFERING = 0;
    private static final int HIGH_OFFERING = 100;
    
    public static int setOffering(int offering, CropData cropData){
        // if offering is negative or greater than 100, return -1
        if ( ( offering < LOW_OFFERING ) || ( offering > HIGH_OFFERING ) )
            return -1;
        
        return offering;
    }
    
}
