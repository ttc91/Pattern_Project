package com.company.structural.flyweight_pattern;

public class Soldier implements ISoldier {
    public String name;

    public Soldier(String name) {
        this.name = name;
        System.out.println("Da tao "+this.name);
    }

    @Override
    public void setLevel(Level level) {
        System.out.println("Star: "+level.getStar()+ " Id: "+level.getId());
    }
}
