package com.example.lutemon.lutemons;

public abstract class Lutemon {
    private String name;
    private String color;
    private String eyeColor;
    private int atk; //attack power
    private int hp; //health points
    private int battleHp; //temporary health points for while the battle lasts
    private int def; //defense ability points
    private int experience; //can be gained via training and by winning battles;  enhances attack power in a battle
    private String location; //where the Lutemon is currently (Chillin, Training Area or Battle Arena)
    private int age;
    private boolean isSelected; //whether the Lutemon is selected by the user for some activity


    //constructor
    public Lutemon(String name, String color, String eyeColor, int atk, int hp, int def, int experience, String location, int age) {
        this.name = name;
        this.color = color;
        this.eyeColor = eyeColor;
        this.atk = atk;
        this.hp = hp;
        this.def = def;
        this.experience = experience;
        this.location = location;
        this.age = age;
    }

    public void select(){
        isSelected = true;
    }
    public void unSelect(){
        isSelected = false;
    }
    public void defend(){
        /*
        * increases own health points in a battle depending on defense ability points
        * */

    }

    public int attack(Lutemon lutemon){
        /*
         * decreases health points of the opponent in a battle, the number of decrease in points depends on own attack power and experience
         * @param lutemon: the opponent
         * @return the updated (decreased) health points of the opponent
         * */

    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getBattleHp() {
        return battleHp;
    }

    public void setBattleHp(int battleHp) {
        this.battleHp = battleHp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
