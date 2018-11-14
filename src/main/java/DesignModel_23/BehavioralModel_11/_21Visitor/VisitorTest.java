package DesignModel_23.BehavioralModel_11._21Visitor;

import DesignModel_23.BehavioralModel_11._21Visitor.Impl.MySubject21;
import DesignModel_23.BehavioralModel_11._21Visitor.Impl.MyVisitor;
import DesignModel_23.BehavioralModel_11._21Visitor.Interface.Subject21;
import DesignModel_23.BehavioralModel_11._21Visitor.Interface.Visitor;

public class VisitorTest {

    public static void main(String[] args) {

        //创建访问者
        Visitor visitor = new MyVisitor();
        //创建被访问者
        Subject21 subject21 = new MySubject21();
        //接受访问，获取被访问者的内容
        subject21.accept(visitor);
    }
}

/**
 * 该模式适用场景：
 * 如果我们想为一个现有的类增加新功能，不得不考虑几个事情：
 * 1、新功能会不会与现有功能出现兼容性问题？
 * 2、以后会不会再需要添加？
 * 3、如果类不允许修改代码怎么办？
 *
 * 面对这些问题，最好的解决方法就是使用访问者模式，访问者模式适用于数据结构相对稳定的系统，把数据结构和算法解耦。
 *
 */
