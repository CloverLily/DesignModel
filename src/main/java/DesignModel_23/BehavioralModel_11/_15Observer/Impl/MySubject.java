package DesignModel_23.BehavioralModel_11._15Observer.Impl;

public class MySubject extends AbstractSubject {
    @Override
    public void operat() {
        System.out.println(" MySubject has updated~ ");
        notifyObservers();
    }
}
