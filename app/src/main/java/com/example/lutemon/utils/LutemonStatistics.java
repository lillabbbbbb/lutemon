package com.example.lutemon.utils;

import com.example.lutemon.lutemons.Lutemon;

import java.time.LocalTime;
import java.util.List;
import java.util.Map;

public class LutemonStatistics {
    /*
    * responsible for keeping track of general statistics and individual
    * lutemon statistics regarding their battles and trainings.
    * */

    private Map<Lutemon, Integer> totalBattles;
    private Map<Lutemon, Integer> totalWins;
    private Map<Lutemon, List<LocalTime>> trainingTimes;
    private Map<Lutemon, Integer> avgTrainingTime;
    private Map<Lutemon, Integer> gainedXP;


    public void addBattle(Lutemon lutemon){
       //increment the lutemon's number of battles

    }

}
