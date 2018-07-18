package com.projekty;

import java.io.Serializable;
import java.util.ArrayList;

public class Army implements Serializable{

    String unitName;
    ArrayList<Soldier> koszary = new ArrayList<>();


    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public ArrayList<Soldier> getKoszary() {
        return koszary;
    }

    public void setKoszary(ArrayList<Soldier> koszary) {
        this.koszary = koszary;
    }
}