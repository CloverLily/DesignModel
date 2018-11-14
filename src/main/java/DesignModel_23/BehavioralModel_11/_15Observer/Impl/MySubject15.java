package DesignModel_23.BehavioralModel_11._15Observer.Impl;

public class MySubject15 extends AbstractSubject {

    /**
     * 被观察者一系列操作
     */
    @Override
    public void operat() {
        //被观察者的更新操作
        System.out.println(" MySubject15 has updated~ ");
        //被观察者更新后通知所有观察者，观察者再做相应更新
        notifyObservers();
    }
}
