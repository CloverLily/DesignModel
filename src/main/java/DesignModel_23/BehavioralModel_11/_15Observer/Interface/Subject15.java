package DesignModel_23.BehavioralModel_11._15Observer.Interface;

/**
 * Subject接口（被订阅对象）
 */
public interface Subject15 {
    /*增加观察者*/
    public void add(Observer observer);

    /*删除观察者*/
    public void del(Observer observer);

    /*通知所有观察者*/
    public void notifyObservers();

    /*被订阅对象的一些操作*/
    public void operat();
}
