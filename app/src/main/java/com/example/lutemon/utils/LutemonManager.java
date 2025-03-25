package com.example.lutemon.utils;

import com.example.lutemon.lutemons.Lutemon;

import java.util.List;

public class LutemonManager {
    /*
     * manages all the lutemons in the game
     * implemented as a singleton object
     * */

    private LutemonManager instance; //the singleton instance
    private int totalBattles; //the number of battles played in the game in total
    private List<Lutemon> lutemons; //all the lutemons that have been created
    private List<String> locationNames; //a list containing the names of all the locations where lutemons can be in the game


    //private constructor
    private LutemonManager(){}

    //getter for the singleton instance
    public LutemonManager getInstance(){
        if(instance == null){
            instance = new LutemonManager();
        }
        return instance;
    }

    public void createLutemon(Lutemon lutemon){
        //@param lutemon: the object to be appended to the list
        lutemons.add(lutemon);
    }

    public void addXP(Lutemon lutemon){
        /*
        adds one experience point to a lutemon
        @param lutemon: the lutemon whose experience points are to be incremented
        * */

        //iterate lutemons list


        //find the lutemon by memory code

    }
    public void implementEyeColor(Lutemon lutemon){
        //????
    }


    public void select(List<Lutemon> lutemons){
        /*
        * marks each lutemon in the parameter list as selected
        *  @param lutemons: a list of those lutemons that have been ticked and are therefore to be selected to do some activity
        * */
    }

    public void sendToArena(Lutemon lutemon){
        /*
        * sends a lutemon to the Battle Arena by changing its location
        * @param lutemon: the lutemon whose location is to be changed
        * */
    }

    public void sendToTraining(Lutemon lutemon){
        /*
         * sends a lutemon to the Training Area by changing its location
         * @param lutemon: the lutemon whose location is to be changed
         * */
    }

    public void sendLutemonToChill(Lutemon lutemon){
        /*
         * sends a lutemon to Chillin' by changing its location
         * @param lutemon: the lutemon whose location is to be changed
         * */
    }


    public void addBattle(){
        //increment the number of battles by 1
        totalBattles++;
    }


    //getters and setters
    public int getTotalBattles() {
        return totalBattles;
    }

    public List<Lutemon> getLutemons() {
        return lutemons;
    }

    public void setLutemons(List<Lutemon> lutemons) {
        this.lutemons = lutemons;
    }

    public List<String> getLocationNames() {
        return locationNames;
    }

    public void setLocationNames(List<String> locationNames) {
        this.locationNames = locationNames;
    }
}
