package com.projekty;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        Weapon w1 = new Weapon(10.5, 10, "bron");
        Soldier cannonFodder = new Soldier("Stefan");
        cannonFodder.addWeapon(w1);

        Army armia1 = new Army();
        armia1.setUnitName("armia1");

        try(ObjectOutputStream s1 = new ObjectOutputStream(new FileOutputStream("x1.txt"))){
            s1.writeObject(armia1);
        }catch (Exception e){
            e.printStackTrace();
        }

        try(ObjectInputStream s2 = new ObjectInputStream(new FileInputStream("x1.txt"))){
            System.out.println(s2.readObject());
        } catch (IOException |ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}