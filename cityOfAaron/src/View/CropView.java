/*
 * -------------------------------------------------------------
 * The CropView class - part of the view layer
 * Object of this class manages the crop view
 * Author: Kevin Bingham and Tyler Day team
 * Date last modified: June 2018
 * -------------------------------------------------------------
 */

package View;

import Model.*;
import Control.*;
import java.util.Scanner;
import cityOfAaron.CityOfAaron;

public class CropView {
 // Create a Scanner object
 private static Scanner keyboard = new Scanner(System.in);   
     
 // Get references to the Game object and the CropData object
 private static Game theGame = CityOfAaron.getCurrentGame();
 private static CropData cropData = theGame.getCropData();
 
// The runCropsView method()
// Purpose: runs the cityOfAaron game
// Parameters: none
// Returns: none
public static void runCropView(){
    // call the buyLandView() method
    buyLandView();
    
    // call the sellLandView() method
    sellLandView();
    
    // call the feedPeopleView() method
    feedPeopleView();
    
    // call plantCropsView() method
    plantCropsView();
    
    // call the showStarvedView() method
    showStarvedView();
    
    // call the displayCropsReportView() method
    displayCropsReportView();
}

// The buyLandView method
// Purpose: interface with the user input for buying land
// Parameters: none
// Returns: none
 public static void buyLandView(){
     // Get the cost of land for this round.
     int price = CropControl.calcLandCost();

     // Prompt the user to enter the number of acres to buy
     System.out.format("Land is selling for %d bushels per acre.%n",price);
     System.out.print("\nHow many acres of land do you wish to buy? "); 

    //  Get the user’s input and save it.
    int toBuy;
    toBuy = keyboard.nextInt();

    // Call the buyLand( ) method in the control layer to buy the land
    CropControl.buyLand(toBuy, price, cropData);
    }
 
// The sellLandView method
// Purpose: interface with the user input for selling land
// Parameters: none
// Returns: none
 public static void sellLandView(){
     // Get the cost of land for this round.
     int price = CropControl.calcLandCost();
     
     // Prompt the user to enter the number of acres to sell
     System.out.format("Land is selling for %d bushels per acre.%n",price);
     System.out.print("\nHow many acres of land do you wish to sell? "); 
     
     //  Get the user’s input and save it.
    int toSell;
    toSell = keyboard.nextInt();
    
     // Call the sellLand( ) method in the control layer to sell the land
    CropControl.sellLand(toSell, price, cropData);
    }

// The feedPeopleView method
// Purpose: interface with the user input for feeding people
// Parameters: none
// Returns: none
 public static void feedPeopleView(){
     // Get the number of people fed for this round.
     
    }
 
// The platCropsView method
// Purpose: interface with the user input for planting crops
// Parameters: none
// Returns: none
 public static void plantCropsView(){ 
        
    }
 
// The showStarvedView method
// Purpose: show user how many people staved
// Parameters: none
// Returns: none
 public static void showStarvedView(){
     
    }
 
 // The displayCropsReport method
// Purpose: show users crops report
// Parameters: none
// Returns: none
 public static void displayCropsReportView(){
     
    }
}
