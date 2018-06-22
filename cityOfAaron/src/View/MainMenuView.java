/*
 * -------------------------------------------------------------
 * The MainMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Kevin Bingham and Tyler Day team
 * Date last modified: June 2018
 * -------------------------------------------------------------
 */

package View;

import cityOfAaron.CityOfAaron;
import Model.*;

public class MainMenuView extends MenuView{
    
    // The MainMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    // ===================================
    public MainMenuView() {
       super( "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: MAIN GAME MENU  *\n" +
                   "**********************************\n" +
                   " 1 - Start new game\n" +
                   " 2 - Get and start a saved game\n" +
                   " 3 - Get help on playing the game\n" +
                   " 4 - Save game\n" +
                   " 5 - Quit\n", 
                5);
    }

    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override public void doAction(int option){
        switch(option){
            case 1: // create and start a new game
                startNewGame();
                break;
            case 2: // get and start a saved game
                startSavedGame();
                break;
            case 3: // get help menu
                displayHelpMenuView();
                break;
            case 4: // save game
                displaySaveGameView();
                break;
            case 5:
                System.out.println("Thanks for playing ... goodbye.");
        }
    } 
    
     // The startNewGame method
     // Purpose: creates game object and starts the game
     // Parameters: none
     // Returns: none
     // ===================================     
     public void startNewGame(){
        // Create a new Game object.
        Game theGame = new Game();

        // Save a reference to it in the CityOfAaron class.
        CityOfAaron.setCurrentGame(theGame);
        
        // Display the Banner Page.
        System.out.println("\nWelcome to the city of Aaron."
                           +"\nThe lives in the city are under your control");

        
        // Create a new Player object
        Player thePlayer = new Player();
        
        // Prompt for and get the user’s name.
        String name;
        System.out.println("\nPlease type in your first name: ");
        name = keyboard.next();

        // Save the user’s name in the Player object
        thePlayer.setName(name);

        // Save a reference to the player object in the Game object
        theGame.setThePlayer(thePlayer);

        // Display a welcome message
        System.out.println("\nWelcome " + name + " have fun.");

        // Create a CropData object, 
        CropData cropData = new CropData();

        // initialize it
        cropData.setYear(0);
        cropData.setPopulation(100);
        cropData.setNewPeople(5);
        cropData.setCropYield(3);
        cropData.setNumberWhoDied(0);
        cropData.setOffering(10);
        cropData.setWheatInStore(2700);
        cropData.setAcresOwned(1000);
        cropData.setAcresPlanted(1000);
        cropData.setHarvest(3000);
        cropData.setOfferingBushels(300);
        cropData.setAcresPlanted(1000); 
        
         // save a reference to it in the Game 
        theGame.setCropData(cropData);
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
     }
     
     // The startSavedGame method
     // Purpose: get game object and starts saved game
     // Parameters: none
     // Returns: none
     // ===================================     
     public void startSavedGame(){
         System.out.println("\nStart saved game option selected.");
     }
     
     // The displayHelpMenuView method
     // Purpose: opens help menu
     // Parameters: none
     // Returns: none
     // ===================================     
     public void displayHelpMenuView(){
         //create HelpMenuView object
        HelpMenuView helpMenu = new HelpMenuView();
        
        // display help me
        helpMenu.displayMenu();
     }

     // The displaySaveGameView method
     // Purpose: creates game object and starts the game
     // Parameters: none
     // Returns: none
     // ===================================     
     public void displaySaveGameView(){
         System.out.println("\nDisplay save game menu.");
     }
}
