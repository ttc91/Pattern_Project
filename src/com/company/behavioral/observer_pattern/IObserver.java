package com.company.behavioral.observer_pattern;

public interface IObserver {
    public void Notify(ISubject subject, Object arg);
}
