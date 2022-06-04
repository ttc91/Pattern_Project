package com.company.behavioral.observer_pattern;

public class Email implements IObserver {
    protected DesignPatternGroup group;
    public Email(DesignPatternGroup group){
        this.group = group;
        this.group.addPlatform(this);
    }
    @Override
    public void Notify(ISubject subject, Object arg) {
        DesignPatternGroup conSubject = new DesignPatternGroup();
        if (subject instanceof DesignPatternGroup){
            conSubject = (DesignPatternGroup) subject;
            System.out.println("Notify Email page about the new change "+
                    "\n\t Status: " +conSubject.getStatus()+
                    "\n\t Exercise: "+conSubject.getExercise());
        }
    }
}
