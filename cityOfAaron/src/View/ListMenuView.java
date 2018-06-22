/*
 * -------------------------------------------------------------
 * The ListMenuView class - part of the view layer
 * Object of this class manages the main menu
 * Author: Kevin Bingham and Tyler Day team
 * Date last modified: June 2018
 * -------------------------------------------------------------
 */

package View;

import cityOfAaron.CityOfAaron;
import Model.*;

public class ListMenuView extends MenuView{

    public ListMenuView() {
        super("\n" +
               "**********************************\n" +
               "* CITY OF AARON: LIST MENU  *\n" +
               "**********************************\n" +
               " 1 - List or view the animals in the storehouse\n" +
               " 2 - List or view the tools in the storehouse\n" +
               " 3 - List or view the provisions in the storehouse\n" +
               " 4 - List or view the authors of this game\n" +
               " 5 - Return to previous menu\n", 
                5);
    }

    @Override
    public void doAction(int option) {
        switch(option){
            case 1: // show goals help
                //listAnimals();
                System.out.println("Option 1");
                break;
            case 2: // show where the City of Aaron is
                //listTools();
                System.out.println("Option 2");
                break;
            case 3: // get help menu
                //listProvisions();
                System.out.println("Option 3");
                break;
            case 4: // show move help
                //listTeam();
                System.out.println("Option 4");
                break;
            case 5: //previous menu
                return;
        }
    }
}
