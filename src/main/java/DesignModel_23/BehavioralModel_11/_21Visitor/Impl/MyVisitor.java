package DesignModel_23.BehavioralModel_11._21Visitor.Impl;

import DesignModel_23.BehavioralModel_11._21Visitor.Interface.Subject21;
import DesignModel_23.BehavioralModel_11._21Visitor.Interface.Visitor;

public class MyVisitor implements Visitor {

    @Override
    public void visit(Subject21 sub) {
        System.out.println("Visit the subject :" + sub.getSubject());
    }
}
