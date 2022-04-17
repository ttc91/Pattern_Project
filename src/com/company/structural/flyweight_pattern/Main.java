package com.company.structural.flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<ISoldier> soldiers = new ArrayList<>();
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        createSoldier(5, "Sniper", 1);
        createSoldier(5, "Spy", 1);
        createSoldier(3, "Spy", 3);
        createSoldier(2, "Sniper", 2);
        long endTime = System.currentTimeMillis();
        System.out.println("---");
        System.out.println("Total soldiers made : " + soldiers.size());
        System.out.println("Total type of soldiers made : " + SoldierFactory.getTotalOfSoldiers());
        System.out.println("-------------------------------------");
    }

    private static void createSoldier(int numberOfSoldier, String soldierName, int numberOfStar) {
        for (int i = 1; i <= numberOfSoldier; i++) {
            Level star = new Level(numberOfStar, "Soldier" + (soldiers.size() + 1));
            ISoldier soldier = SoldierFactory.createSoldier(soldierName);
            System.out.print("Solder " + i + ": ");
            soldier.setLevel(star);
            soldiers.add(soldier);
        }

    }
}
