package com.company.behavioral.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class DesignPatternGroup implements ISubject {
    private List<IObserver> friends = new ArrayList<IObserver>();
    private String status;
    private String exercise;
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        update();
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
        update();
    }

    @Override
    public void addPlatform(IObserver observer) {
        friends.add(observer);
    }

    @Override
    public void removePlatform(IObserver observer) {
        friends.remove(observer);
    }

    @Override
    public void notifyObserver(ISubject subject, Object arg) {
        friends.forEach((observer) -> {
            observer.Notify(subject, arg);
        });
    }

    public void update() {
        notifyObserver(this, "");
    }
}
