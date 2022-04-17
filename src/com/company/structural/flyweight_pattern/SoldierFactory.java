package com.company.structural.flyweight_pattern;

import java.util.HashMap;

public class SoldierFactory {
    private static HashMap<String,ISoldier> soldiers = new HashMap<String,ISoldier>();
    public static ISoldier createSoldier(String name){
        ISoldier soldier = soldiers.get(name);
        if(soldier == null){
            soldier = new Soldier(name);
            soldiers.put(name, soldier);
        }
        System.out.println("Soldier: "+soldier);
        return soldier;
    }
    public static String getTotalOfSoldiers(){
        return "Total number of soldiers: "+soldiers.size();
    }
}
