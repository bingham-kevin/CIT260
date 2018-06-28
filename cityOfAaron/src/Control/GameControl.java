/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import cityOfAaron.CityOfAaron;
import Model.*;

public class GameControl {
   // size of the Locations array
   private static final int MAX_ROW = 5;
   private static final int MAX_COL = 5;
    
   // reference to a Game object
   private static Game theGame;
   
   public static void createNewGame(String pName){

   //Create the Game object, save it in the main driver file
   theGame = new Game();
   CityOfAaron.setCurrentGame(theGame);

   // create the player object. Save it in the game object
   Player thePlayer = new Player();
   thePlayer.setName(pName);
   theGame.setThePlayer(thePlayer);
   
   createCropDataObject();
   createAnimalList();
   createProvisionsList();
   createToolsList();
   createMap();
   }

    public static void createCropDataObject(){
        CropData theCrops = new CropData();
        
        theCrops.setYear(0);
        theCrops.setPopulation(100);
        theCrops.setNewPeople(5);
        theCrops.setCropYield(3);
        theCrops.setNumberWhoDied(0);
        theCrops.setOffering(10);
        theCrops.setWheatInStore(2700);
        theCrops.setAcresOwned(1000);
        theCrops.setAcresPlanted(1000);
        theCrops.setHarvest(3000);
        theCrops.setOfferingBushels(300);
        theCrops.setAcresPlanted(1000); 
        
        theGame.setCropData(theCrops);         
    }
    
    public static void createAnimalList(){
        ArrayList<ListItem> animals = new ArrayList<>();
        
        animals.add(new ListItem("cows", 12));
        animals.add(new ListItem("horses", 3));
        animals.add(new ListItem("pigs", 7));
        animals.add(new ListItem("goats", 4));
       
        theGame.setAnimals(animals);
    }
    
    public static void createToolsList(){
        ArrayList<ListItem> tools;
        tools = new ArrayList<>();
        
        tools.add(new ListItem("shovel", 4));
        tools.add(new ListItem("hoe", 3));
        tools.add(new ListItem("plow", 2));
       
        theGame.setTools(tools);
    }
    
    public static void createProvisionsList(){
        ArrayList<ListItem> provisions;
        provisions = new ArrayList<>();
        
        provisions.add(new ListItem("shoes", 5));
        provisions.add(new ListItem("bandages", 18));
        provisions.add(new ListItem("water barrels", 78));
       
        theGame.setProvisions(provisions);
    }
    
    // The createMap method
    // Purpose: creates the location objects and the map
    // Parameters: none
    // Returns: none
    public static void createMap(){
        // create the Map object, it is 5 x 5
        // refer to the Map constructor
        Map theMap = new Map(MAX_ROW, MAX_COL);
        
        // create a string that will go in the Location objects
        // that contain the river
        String river = "\nYou are on the River. The river is the source" +
                       "\nof life for our city. The river marks the eastern " +
                       "\nboundary of the city - it is wilderness to the East.";

        // create a new Location object
        Location loc = new Location();

        // use setters in the Location class to set the description and symbol
        loc.setDescription(river);
        loc.setSymbol("~~~");  

        // set this location object in each cell of the array in column 4      
        for(int i = 0; i < MAX_ROW; i++){
            theMap.setLocation(i, 4, loc);
         }
        // define the string for a farm land location
        String farmland = "\nYou are on the fertile banks of the River." +
        "\nIn the springthis low farmland floods and is covered with rich" +
        "\nnew soil. Wheat is planted as far as you can see."; 

        // set a farmland location with a hint
        loc = new Location();
        loc.setDescription(farmland + "\nOne bushel will plant two acres of wheat.");
        loc.setSymbol("!!!");
        for(int i = 0; i < MAX_ROW-3; i++){
            for(int o = 0; o < MAX_COL; o++){
        theMap.setLocation(i, o, loc);
            }
        }
        String mountain = "the mountains north of the City of Aaron," + 
                "/nthey provde a natural defense for the city!";
        loc = new Location();
        loc.setDescription(mountain);
        loc.setSymbol("MMM");
        for(int i = 2; i < MAX_COL-1; i++){
            theMap.setLocation(0, i, loc);
        }
        String city = "The grand City of Aaron, over which you rule";
        loc = new Location();
        loc.setDescription(city);
        loc.setSymbol("^^^");
        for(int i = 1; i < MAX_ROW-3; i++){
            for(int o = 2; o < MAX_COL-1; o++){
                theMap.setLocation(i, o, loc);
            }
        }
        String forest = "Our Wonderful Southern Forests!" + 
                "/nWild Game roams them,"+
                "/n and their beauty enhances the City's luster!";
        loc = new Location();
        loc.setDescription(forest);
        loc.setSymbol("FFF");
        for(int i = 3; i < MAX_ROW; i++){
            for(int o = 2; o < MAX_COL-1; o++){
                theMap.setLocation(i, o, loc);
            }
        }
        theGame.setMap(theMap);
    }
}
