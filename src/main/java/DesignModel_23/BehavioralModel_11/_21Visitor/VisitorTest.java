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
