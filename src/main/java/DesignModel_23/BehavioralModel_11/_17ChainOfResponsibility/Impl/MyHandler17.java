package DesignModel_23.BehavioralModel_11._17ChainOfResponsibility.Impl;

import DesignModel_23.BehavioralModel_11._17ChainOfResponsibility.AbstractHandler17;
import DesignModel_23.BehavioralModel_11._17ChainOfResponsibility.Interface.Handler17;

public class MyHandler17 extends AbstractHandler17 implements Handler17 {

    private String name;

    public MyHandler17(String name){
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name +" deal~ ");
        if(getHandler17() != null){
            getHandler17().operator();
        }
    }
}
