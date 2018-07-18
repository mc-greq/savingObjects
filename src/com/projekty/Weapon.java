package com.projekty;

public class Weapon {

    double firepower;
    int ammo;
    String name;

    public Weapon(double firepower, int ammo, String name) {
        this.firepower = firepower;
        this.ammo = ammo;
        this.name = name;
    }

    public double getFirepower() {
        return firepower;
    }

    public void setFirepower(double firepower) {
        this.firepower = firepower;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.firepower + " " + this.ammo + " " + this.name;
    }
}