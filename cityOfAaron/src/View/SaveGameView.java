/*
 * -------------------------------------------------------------
 * The SaveGameView class - part of the view layer
 * Object of this class manages the save game menu
 * Author: Kevin Bingham and Tyler Day team
 * Date last modified: July 2018
 * -------------------------------------------------------------
 */

package View;

import Model.*;
import cityOfAaron.CityOfAaron;
import java.util.Scanner;
import Control.*;


public class SaveGameView extends MenuView {
    private static Game game = CityOfAaron.getCurrentGame();
    
    // The SaveGameView constructor
    // Purpose: Initialize the menu data
    // Parameters: none
    // Returns: none
    public SaveGameView() {
        super ("\n" +
        "**********************************\n" +
        "*** CITY OF AARON: SAVE MENU  ****\n" +
        "**********************************\n" +
        " 1 - Save Game\n" +
        " 2 - Return to Main Menu\n",
        2);
    }
    
    @Override public void doAction(int option){
        switch(option){
            case 1: // save game
                saveGame();
                break;
            case 2: // return to main menu
                return;
        }
    }
    
    // The save game method
    // Purpose: to save the game
    // Parameters: none
    // Returns: none
    public void saveGame(){
     Game theGame = CityOfAaron.getCurrentGame();
     System.out.println("What is the full path of the loction to save your game?");
     String name = keyboard.next();
    
     GameControl.saveCurrentGame(theGame, name);     
     }
}
