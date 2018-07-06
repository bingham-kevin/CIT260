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
import Exception.CropException;
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
    
    // call the setOffering() method
    setOfferingView();
    
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

    //  Get the user’s input and save it.
    int toBuy;
    boolean paramsNotOkay;
        do{
           paramsNotOkay = false;
           System.out.print("\nHow many acres of land do you wish to buy? ");  
           toBuy = keyboard.nextInt();
           try{
                CropControl.buyLand(price, toBuy, cropData);
            }
           catch(CropException e){
                 System.out.println("I am sorry master, I cannot do this.");
                 System.out.println(e.getMessage());
                 paramsNotOkay = true;
            }
        }while(paramsNotOkay);
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

     
     //  Get the user’s input and save it.
    int toSell;
    boolean paramsNotOkay;
         do{
           paramsNotOkay = false;
             System.out.print("\nHow many acres of land do you wish to sell? "); 
                
            toSell = keyboard.nextInt();

             // Call the sellLand( ) method in the control layer to sell the land
            try{
                        CropControl.sellLand(price, toSell, cropData);
                    }
                catch(CropException e) {
                         System.out.println("I am sorry master, I cannot do this.");
                     System.out.println(e.getMessage());
                     paramsNotOkay = true;
               }
            }while(paramsNotOkay);
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
 
// The setOfferingView method
// Purpose: interface with the user input for setting the offering
// Parameters: none
// Returns: none
 public static void setOfferingView(){ 
     // Prompt the user to choose a percentage of wheat to offer
     System.out.print("\nWhat percentage do you wish to offer? ");
     
     //get user input and save it
     int offering;
     boolean paramsNotOkay;
     do{
        paramsNotOkay = false;
        offering = keyboard.nextInt();
        try{
            CropControl.setOffering(offering, cropData);
        }
        catch(CropException e){
             System.out.println("I am sorry master, I cannot do this.");
             System.out.println(e.getMessage());
             System.out.println("\nWhat percentage do you wish to offer? ");
             paramsNotOkay = true;
            }
        } while(paramsNotOkay);
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
