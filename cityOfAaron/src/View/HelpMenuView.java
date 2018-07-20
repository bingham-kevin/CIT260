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
                return;
        }
    }
    
    public void viewGoals(){
        System.out.println("\nThe Goals of the City of Aaron are simple!\n"
                + "You are tasked with leading and growing the aforementioned\n"
                + "city through ten years, ensuring crops are grown, the people\n"
                + "are fed, and there is an offering given. you have access to\n"
                + "tools, animals, and other resources to help you through these\n"
                + "ten years! Do well, and the city will thrive. do poorly and\n"
                + "your term may end more abruptly than you might hope!");
    }
    
    public void cityOfAaronHelp(){
        System.out.println("\nThe City of Aaron is located in America in ancient\n"
                + "times. It is located in the vicinity of Ammonihah, as well\n"
                + "as near the cities of Moroni and Nephihah. It is a nephite\n"
                + "city.");
    }
   
    public void viewMapHelp(){
        System.out.println("\nYou can view the map through the Game menu screen.\n"
                + "This allows you to get a good look at the city and surrounding\n"
                + "countryside. To do this, select the first option in the game menu");
    }
    
    public void viewMoveHelp(){
        System.out.println("\nTo Move around the city, select the third option\n"
                + "in the game's menu, then input the coordinates, x then y, of\n"
                + "the location you wish to visit within the city or surrounding area!");
    }
    
    public void viewListHelp(){
        System.out.println("\nTo view the list of the city's provisions, go to the\n"
                + "second option in the game's menu, then select from that list\n"
                + "the actual list you wish to view!.");
    }
}
