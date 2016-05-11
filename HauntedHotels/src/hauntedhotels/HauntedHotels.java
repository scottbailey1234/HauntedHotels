/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hauntedhotels;

import byui.cit260.hauntedHotels.model.Player;

/**
 *
 * @author scottbailey1234
 */
public class HauntedHotels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Fred Flinstone");
        playerOne.setChallengesSolved(25);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
