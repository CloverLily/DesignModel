package DesignModel_23.BehavioralModel_11._15Observer.Impl;

import DesignModel_23.BehavioralModel_11._15Observer.Interface.Observer;
import DesignModel_23.BehavioralModel_11._15Observer.Interface.Subject;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject {

    //观察者集合
    private Vector<Observer> vector = new Vector<>();

    /**
     * 添加观察者
     * @param observer 被添加观察者
     */
    @Override
    public void add(Observer observer) {
        vector.add(observer);
    }

    /**
     * 移除观察者
     * @param observer 被移除观察者
     */
    @Override
    public void del(Observer observer) {
        vector.remove(observer);
    }

    /**
     * 更新提醒（提醒所有观察者）
     */
    @Override
    public void notifyObservers() {
        Enumeration<Observer> enumo = vector.elements();
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update();
        }
    }

}
