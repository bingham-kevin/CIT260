/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curiousworkmanship;

import byui.cit260.curiousWorkmanship.model.Actor;
import byui.cit260.curiousWorkmanship.model.Player;

/**
 *
 * @author kbingham
 */
public class CuriousWorkmanship {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player playerOne = new Player();
        playerOne.setName("Fred Flintstone");
        playerOne.setBestTime(7.00);
        
        String playerOneName = playerOne.getName();
        double playerOneBestTime = playerOne.getBestTime();
        
        System.out.println(playerOne.toString());
        System.out.println(Actor.Father.getName());
        System.out.println(Actor.Father.getDescription());
    }
    
}
