/*
 * -------------------------------------------------------------
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 *  Team members: Kevin Bingham, Tyler Day
 * -------------------------------------------------------------
 */

package cityOfAaron;

import View.*;
import cityOfAaron.model.Game;

public class CityOfAaron {
    // variable for keeping a reference to the Game object
    private static Game theGame = null;

    public static Game getCurrentGame() {
        return theGame;
    }

    public static void setCurrentGame(Game theGame) {
        CityOfAaron.theGame = theGame;
    }

    // main function - entry point for the program
    // runs the main menu
    public static void main(String[] args) {
        MainMenuView mmv = new MainMenuView();
        mmv.displayMenuView();
    }
    
}