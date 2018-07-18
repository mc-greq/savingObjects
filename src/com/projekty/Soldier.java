package com.projekty;

import java.util.ArrayList;

public class Soldier {

    String personalData;
    ArrayList<Weapon> weapons = new ArrayList<>();

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }

    public Soldier(String personalData) {
        this.personalData = personalData;
    }

    public String getPersonalData() {
        return personalData;
    }

    public void setPersonalData(String personalData) {
        this.personalData = personalData;
    }

    public ArrayList<Weapon> getWeapons() {
        return weapons;
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = weapons;
    }
}
