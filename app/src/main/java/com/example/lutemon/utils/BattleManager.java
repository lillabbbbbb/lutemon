package com.example.lutemon.utils;

import com.example.lutemon.lutemons.Lutemon;

public class BattleManager {
    /*
    * manages the lutemons in the Battle Arena
    * implemented as a singleton object
    * */

    //global variables
    private BattleManager instance; //the singleton instance
    private Lutemon[] lutemonsInBattle;
    private Lutemon winner;
    private Lutemon loser;
    private String battleDescription;


    //private constructor
    private BattleManager(){}


    public BattleManager getInstance(){
        if(instance == null){
            instance = new BattleManager();
        }
        return instance;
    }

    public void addLutemonToBattle(Lutemon lutemon){
        if(lutemonsInBattle[0] == null){
            lutemonsInBattle[0] = lutemon;
        }
        else lutemonsInBattle[1] = lutemon;
    }

    public void endBattle(){
        /*
        * this method is called when the health points of one of the lutemons in the battle drops to zero
        * */

        //assign winner and loser lutemons


        //increment the xp of the winner by 1


        //send lutemons back home

    }

}
