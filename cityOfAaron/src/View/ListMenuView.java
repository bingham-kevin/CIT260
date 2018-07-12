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
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

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
               " 5 - Save list of tools\n"+
               " 6 - Return to previous menu\n", 
                6);
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
            case 5: //save tool list
                saveTools();
                break;
            case 6: //previous menu
                return;
        }
    }

    private void listAnimals(){
       Game theGame = CityOfAaron.getCurrentGame();
       ArrayList<ListItem> animals = theGame.getAnimals();
       
       for(ListItem animal : animals){
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
    
    // The saveTools method
    // Purpose: save the list of tools to a file
    // Parameters: none
    // Returns: none
    private void saveTools(){
        Scanner keyboard = new Scanner(System.in);
        
        // declare a string to hold the file name
        String fileName = null;
        
        // declare a reference to a PrintWriter object
        PrintWriter output = null;
        
        // prompt the user for a file name, get and save the user’s input
        System.out.println("What name would you like save this list as?");
        fileName = keyboard.next();
        
        try{
            // create the PrintWriter object
              output = new PrintWriter(fileName);
              
            // get a reference to the ArrayList you want to output
              Game theGame = CityOfAaron.getCurrentGame();
              ArrayList<ListItem> tools = theGame.getTools();
              
            // output a heading for the report
            output.println("\n\n           Tool List             ");
            output.printf("%n%-20s%10s", "  Tool", "Quantity ");
            output.printf("%n%-20s%10s", "----------", "----------");
            
            // use a for loop to get the data from the ArrayList
            // and output it
            for (ListItem tool : tools){
                output.printf("%n%-20s%10s", tool.getName()
                                           , tool.getNumber());
            }
            
            // output completion message
            System.out.println("File save completed. File name is " + fileName + ".");
        }
        catch(Exception e){
            // output error message
            System.out.println("Error was encountered.");
        }
        finally{
            // if(output != null) close the file
            if (fileName != null){
                try{
                 // close file
                 output.close();
                }
                catch(Exception ex1){
                 // output error message
                 System.out.println("Error was encountered.");   
                }
            }
        }
    }
}