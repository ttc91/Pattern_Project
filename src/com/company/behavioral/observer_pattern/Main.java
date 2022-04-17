package com.company.behavioral.observer_pattern;

public class Main {
    public static void main(String[] args) {
        DesignPatternGroup DPG = new DesignPatternGroup();

        Email student = new Email(DPG);
        Online utePortal = new Online(DPG);
        DPG.setStatus("Hôm nay học online");
        System.out.println("-----------------");
        DPG.removePlatform(utePortal);
        DPG.setExercise("Bài tập Solid");
        System.out.println("-----------------");
        DPG.addPlatform(utePortal);
        DPG.setStatus("");
    }
}
