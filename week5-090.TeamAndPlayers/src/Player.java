/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kiplagat
 */
public class Player {
    private String name;
    private int amountOfGoals;
    
    public Player(String name){
        this.name = name;
    }
    
    public Player(String name, int amountOfGoals){
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int goals(){
        return this.amountOfGoals;
    }
    
    public String toString(){
        return this.getName() + ", " + "goals " + this.goals();
    }
}
