package DesignModel_23.BehavioralModel_11._15Observer.Impl;

import DesignModel_23.BehavioralModel_11._15Observer.Interface.Observer;
import DesignModel_23.BehavioralModel_11._15Observer.Interface.Subject;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

    //观察者集合
    private Vector<Observer> vector = new Vector<>();

    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }

}
