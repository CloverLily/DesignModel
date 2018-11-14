package DesignModel_23.BehavioralModel_11._15Observer;

import DesignModel_23.BehavioralModel_11._15Observer.Impl.MySubject15;
import DesignModel_23.BehavioralModel_11._15Observer.Impl.Observer1;
import DesignModel_23.BehavioralModel_11._15Observer.Impl.Observer2;
import DesignModel_23.BehavioralModel_11._15Observer.Interface.Subject15;

/**
 * MySubject类就是我们的主对象，即被订阅对象
 * Observer1和Observer2是依赖于MySubject的对象，即订阅对象们
 * 当MySubject变化时，Observer1和Observer2必然变化。
 * <p>
 * AbstractSubject类中定义着需要监控的对象（订阅对象们）列表，可以对其进行修改：
 * 增加或删除被监控对象（订阅对象），且当MySubject（被订阅对象）变化时，负责通知在列表内存在的对象（订阅对象）。
 */
public class ObserverTest {

    public static void main(String[] args) {
        //创建被观察者实例
        Subject15 subject15 = new MySubject15();
        //添加观察者
        subject15.add(new Observer1());
        subject15.add(new Observer1());
        subject15.add(new Observer2());

        //观察者更新
        subject15.operat();
    }
}
