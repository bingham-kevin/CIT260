
// the CropException class - part of the view layer class contains
// all of the methods to catch exceptions input by the player
// Author: Tyler Day & Kevin Bingham
// Date last modified: July 2018
//------------------------------------------------------------

package Exception;

public class CropException extends Exception{
    // Default constructor
    // Purpose: Initializes data members to default values
    // Parameters: none
    // Returns: none
    public CropException(){
    }


    // Parameterized  constructor
    // Purpose: Initializes data members to value passed as a parameter
    // Parameters: A string containing the error message
    // Returns: none
    public CropException(String string){
        super(string);
    } 

}
