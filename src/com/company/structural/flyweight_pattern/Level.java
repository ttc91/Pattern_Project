package com.company.structural.flyweight_pattern;

public class Level {
    private int star;
    private String id;
    public int getStar() {
        return star;
    }

    public String getId() {
        return id;
    }
    public Level(int star, String id){
        this.star=star;
        this.id=id;
    }
}
