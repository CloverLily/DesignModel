package DesignModel_23.BehavioralModel_11._21Visitor.Impl;

import DesignModel_23.BehavioralModel_11._21Visitor.Interface.Subject21;
import DesignModel_23.BehavioralModel_11._21Visitor.Interface.Visitor;

public class MySubject21 implements Subject21 {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);

    }

    @Override
    public String getSubject() {
        return "Welcome~";
    }
}
