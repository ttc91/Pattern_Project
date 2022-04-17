package com.company.behavioral.observer_pattern;

public interface ISubject {
    public void addPlatform(IObserver observer);
    public void removePlatform(IObserver observer);
    public void notifyObserver(ISubject subject, Object arg);
}