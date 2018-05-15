/*
 * The main() class file for the cityOfAaron project
 * CIT-260
 * Spring 2018
 *  Team members: Kevin Bingham, Tyler Day
 */

package cityOfAaron;

import cityOfAaron.model.CropData;
import cityOfAaron.model.ListItem;
import cityOfAaron.model.Location;
import cityOfAaron.model.TeamMember;
import cityOfAaron.model.Player;

/**
 *
 * @author kbingham
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Kevin");
        
        Player playerTwo = new Player();
        playerTwo.setName("Tyler");
        
        CropData yearOne = new CropData();
        yearOne.setYear(1);
        yearOne.setPopulation(170);
        yearOne.setAcresOwned(100);
        yearOne.setCropYield(600);
        yearOne.setWheatInStore(73);
        yearOne.setHarvest(510);
        yearOne.setHarvestAfterOffering(459);
        yearOne.setNewPeople(25);
        yearOne.setNumStarved(34);
        yearOne.setNumberWhoDied(10);
        yearOne.setOffering(51);
        yearOne.setOfferingBushels(110);
        yearOne.setAcresPlanted(90);
        yearOne.setPeopleFed(134);
        yearOne.setEatenByRats(89);
        yearOne.setWheatForPeople(300);
        
        ListItem itemOne = new ListItem();
        itemOne.setName("Shovel");
        itemOne.setNumber(1);
        
        Location locationOne = new Location();
        locationOne.setDescription("Castle");
        locationOne.setSymbol("Image of Castle");
        
        System.out.println(playerOne.toString());
        System.out.println(playerTwo.toString());
        System.out.println(TeamMember.Tyler.getName());
        System.out.println(TeamMember.Tyler.getTitle());
        System.out.println(yearOne.toString());
        System.out.println(itemOne.toString());
        System.out.println(locationOne.toString());
        
    }
    
}