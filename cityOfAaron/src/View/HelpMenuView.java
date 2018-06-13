/*
 * -------------------------------------------------------------
 * The HelpMenuView class - part of the view layer
 * Object of this class manages the help menu
 * Author: Kevin Bingham and Tyler Day team
 * Date last modified: June 2018
 * -------------------------------------------------------------
 */

package View;

import java.util.Scanner;
import cityOfAaron.CityOfAaron;
import Model.*;

public class HelpMenuView {
    Scanner keyboard = new Scanner(System.in);
    private String theMenu;
    private int max;
    
    // The HelpMenuView constructor
    // Purpose: Initializr the menu data
    // Parameters: none
    // Returns: none
    
    public HelpMenuView(){
        theMenu = "\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP MENU  *\n" +
                   "**********************************\n" +
                   " 1 - What are the goals of the game?\n" +
                   " 2 - Where is the city of Aaron?\n" +
                   " 3 - How do I view the map?\n" +
                   " 4 - How do I move to another location?\n" +
                   " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
                   " 6 - Back to the Main Menu\n";
        
        max = 6;
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
         System.out.println(theMenu);

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
            case 1: // show goals help
                viewGoals();
                break;
            case 2: // show where the City of Aaron is
                cityOfAaronHelp();
                break;
            case 3: // get help menu
                viewMapHelp();
                break;
            case 4: // show move help
                viewMoveHelp();
                break;
            case 5: // show list help
                viewListHelp();
                break;
            case 6: // return to main menu
                backToMainMenu();
                break;
        }
    }
    
    public void viewGoals(){
        System.out.println("\nHelp option 1 selected.");
    }
    
    public void cityOfAaronHelp(){
        System.out.println("\nHelp option 2 selected.");
    }
   
    public void viewMapHelp(){
        System.out.println("\nHelp option 3 selected.");
    }
    
    public void viewMoveHelp(){
        System.out.println("\nHelp option 4 selected.");
    }
    
    public void viewListHelp(){
        System.out.println("\nHelp option 5 selected.");
    }
    
    public void backToMainMenu(){
        System.out.println("\nHelp option 6 selected.");
    }
}
