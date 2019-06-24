
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }

    public String getName() {
        return this.name;
    }
    
    public void addPlayer(Player player){
        if(this.size() != maxSize){
             this.players.add(player);
        }
    }
    
    public void printPlayers(){
        for(Player members: players){
            System.out.println(members);
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return this.players.size();
        
    }
    
    public int goals(){
        int i = 0;
        int totalGoals = 0;
        while(i < this.players.size()){
            totalGoals +=this.players.get(i).goals();
            i++;
        }
        return totalGoals;
    }
}
