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


public class GameMenuView extends MenuView {
    Scanner keyboard = new Scanner(System.in);
    private String gameMenu;
    private int max;
    private static Game game = CityOfAaron.getCurrentGame();
    
    // The GameMenuView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    public GameMenuView() {
        super ("\n" +
        "**********************************\n" +
        "*** CITY OF AARON: GAME MENU  ****\n" +
        "**********************************\n" +
        " 1 - View The Map\n" +
        " 2 - Choose a List to View\n" +
        " 3 - Move to a New Location\n" +
        " 4 - Manage Your Crops\n" +
        " 5 - Return to Main Menu\n"        ,
        5);
    }
    // The doAction method
    // Purpose: performs the selected action
    // Parameters: none
    // Returns: none
    // ===================================   
    @Override public void doAction(int option){
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
            case 5: // return to Main Menu
                return;
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
