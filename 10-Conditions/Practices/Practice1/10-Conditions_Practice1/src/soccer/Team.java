/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soccer;

/**
 *
 * @author Administrator
 */
public class Team {
    
    private String teamName;
    private Player[] playerArray;
    
    /* Practice 10-1. Add pointTotal variable here */
    
    
    /* Practice 10-1. Add incPointsTotal() method here */
    
    
    public Team(String teamName) {
        this.teamName = teamName;
    }
    
    public Team(String teamName, Player[] players) {
        this(teamName);
        this.playerArray = players;
    }
    
    public Team() {}

    /**
     * @return the teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * @param teamName the teamName to set
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * @return the playerArray
     */
    public Player[] getPlayerArray() {
        return playerArray;
    }

    /**
     * @param playerArray the playerArray to set
     */
    public void setPlayerArray(Player[] playerArray) {
        this.playerArray = playerArray;
    }
    
    private int pointsTotal; 
    
    public void incPointsToatl (int pointsToatl){
    this.pointsTotal =+ pointsTotal;
    }

    void incPointsTotal(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getPointsTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}