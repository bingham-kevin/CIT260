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
import java.util.ArrayList;

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
                listAnimals();
                break;
            case 2: // show where the City of Aaron is
                listTools();
                break;
            case 3: // get help menu
                listProvisions();
                break;
            case 4: // show move help
                listTeam();
                break;
            case 5: //previous menu
                return;
        }
    }

    private void listAnimals(){
        Game theGame = CityOfAaron.getCurrentGame();
        ArrayList<ListItem> animals = theGame.getAnimals();
        
        for(int i = 0; i< animals.size(); i++){
            ListItem animal = animals.get(i);
            String itemName = animal.getName();
            int itemNumber = animal.getNumber();
            System.out.println(itemName + ": " + itemNumber);
        }
    }

    private void listTools() {
        Game theGame = CityOfAaron.getCurrentGame();
        ArrayList<ListItem> tools = theGame.getTools();
        
        for(ListItem tool : tools){
            String itemName = tool.getName();
            int itemNumber = tool.getNumber();
            System.out.println(itemName + ": " + itemNumber);
        }
    }

    private void listProvisions() {
        Game theGame = CityOfAaron.getCurrentGame();
        ArrayList<ListItem> provisions = theGame.getProvisions();
        
        for(ListItem provision : provisions){
            String itemName = provision.getName();
            int itemNumber = provision.getNumber();
            System.out.println(itemName + ": " + itemNumber);
        }
    }

    private void listTeam() {

    }
}
