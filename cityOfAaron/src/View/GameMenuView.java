/*
 * -------------------------------------------------------------
 * The GameMenuView class - part of the view layer
 * Object of this class manages the game menu
 * Author: Kevin Bingham and Tyler Day team
 * Date last modified: June 13 2018
 * -------------------------------------------------------------
 */

package View;
import java.util.Scanner;
import cityOfAaron.CityOfAaron;
import Model.*;
import Control.*;


public class GameMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String gameMenu;
    private int max;
    private static Game game = CityOfAaron.getCurrentGame();
    
    // The GameMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    public GameMenuView() {
        gameMenu = "\n" +
        "**********************************\n" +
        "*** CITY OF AARON: GAME MENU  ****\n" +
        "**********************************\n" +
        " 1 - View The Map\n" +
        " 2 - Choose a List to View\n" +
        " 3 - Move to a New Location\n" +
        " 4 - Manage Your Crops\n";
        max = 4;
    }
    // The displayMenuView method
    // Purpose: displays the menu, gets the user's input, and does the 
    //          selected action
    // Parameters: none
    // Returns: none
    // =========================================================
        public void displayMenuView() {
    // Display the menu
    // Prompt the user and get the user’s input
    // Perform the desired action
    // Determine and display the next view
    int menuOption = 0;
    
        do{
         // Display the menu
         System.out.println(gameMenu);

         // Prompt the user and get the user’s input
         menuOption = getMenuOption();

         // Perform the desired action
         doAction(menuOption);

         // Determine and display the next view
          } while (menuOption != max);

    }
    // The getMenuOption method
    // Purpose: gets the user's input
    // Parameters: none
    // Returns: integer - the option selected
    // ===================================      
         public int getMenuOption(){
        // declare a variable to hold user’s input
        int userInput;

        // begin loop
        do{
            // get user input from the keyboard
            userInput = keyboard.nextInt();
            
            // if it is not a valid value, output an error message
            if(userInput < 1 || userInput > max){
               System.out.println("\noption must be between 1 and " + max);
            }

        // loop back to the top if input was not valid
        }while(userInput < 1 || userInput > max);

        // return the value input by the user
        return userInput;
    }   
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================   
            public void doAction(int option){
        switch(option){
            case 1: // view the city map
                viewMap();
                break;
            case 2: // view a list of items
                viewList();
                break;
            case 3: // move to a new location
                moveToNewLocation();
                break;
            case 4: // manage the crops
                manageCrops();
                break;
        }
    } 
            //The View Map method
            //purpose: to display the game map
            //Parameters: none.
            //Returns: none
            public void viewMap() {
                System.out.println("\n Map of the City of Aaron and surrounding lands");
            }
            //The View List method
            //purpose: to display the list of tools animals provisions and team
            //Parameters: none.
            //Returns: none
            public void viewList() {
                ListMenuView listMenu = new ListMenuView();
                listMenu.displayMenu();
            }
            //The Move to new location method
            //purpose: to switch the game to a new location
            //Parameters: none.
            //Returns: none
            public void moveToNewLocation() {
                System.out.println ("Select a location to travel to");
            }
            //The manage crops method
            //purpose: to open the display for managing crops
            //Parameters: none.
            //Returns: none
            public void manageCrops() {
                CropView.runCropView();
            }
}
