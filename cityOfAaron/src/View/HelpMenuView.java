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

public class HelpMenuView extends MenuView{
    Scanner keyboard = new Scanner(System.in);
    private String menu;
    private int max;
    
    // The HelpMenuView constructor
    // Purpose: Initializr the menu data
    // Parameters: none
    // Returns: none
    
    public HelpMenuView(){
        super("\n" +
                   "**********************************\n" +
                   "* CITY OF AARON: HELP MENU  *\n" +
                   "**********************************\n" +
                   " 1 - What are the goals of the game?\n" +
                   " 2 - Where is the city of Aaron?\n" +
                   " 3 - How do I view the map?\n" +
                   " 4 - How do I move to another location?\n" +
                   " 5 - How do I display a list of animals, provisions and tools in the city storehouse?\n" +
                   " 6 - Back to the Main Menu\n",
                6);
    }
    
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================       
    @Override public void doAction(int option){
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
