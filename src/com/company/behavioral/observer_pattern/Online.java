package com.company.behavioral.observer_pattern;

public class Online implements IObserver{
    protected DesignPatternGroup admin;
    public Online(DesignPatternGroup admin){
        this.admin = admin;
        this.admin.addPlatform(this);
    }
    @Override
    public void Notify(ISubject subject, Object arg) {
        DesignPatternGroup conSubject = new DesignPatternGroup();
        if (subject instanceof DesignPatternGroup){
            conSubject = (DesignPatternGroup) subject;
            System.out.println("Notify Online page about the new change "+
                    "\n\t Status: " +conSubject.getStatus()+
                    "\n\t Story: "+conSubject.getExercise());
        }
    }
}
