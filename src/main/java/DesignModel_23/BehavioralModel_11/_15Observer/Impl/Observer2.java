package DesignModel_23.BehavioralModel_11._15Observer.Impl;

import DesignModel_23.BehavioralModel_11._15Observer.Interface.Observer;

//观察者2
public class Observer2 implements Observer {
    @Override
    public void update() {
        System.out.println("Observer2 has received~");
    }
}
