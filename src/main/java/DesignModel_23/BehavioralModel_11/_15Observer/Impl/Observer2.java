package DesignModel_23.BehavioralModel_11._15Observer.Impl;

import DesignModel_23.BehavioralModel_11._15Observer.Observer;

//观察者2
public class Observer2 implements Observer {

    /**
     * 更新
     */
    @Override
    public void update() {
        System.out.println("Observer2 has received~");
    }
}
