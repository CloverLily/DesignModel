package DesignModel_23.BehavioralModel_11._15Observer.Impl;

import DesignModel_23.BehavioralModel_11._15Observer.Interface.Observer;

//观察者1
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer1 has received~");
    }
}
