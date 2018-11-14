package DesignModel_23.BehavioralModel_11._22Mediator.Impl;

import DesignModel_23.BehavioralModel_11._22Mediator.Interface.Mediator;
import DesignModel_23.BehavioralModel_11._22Mediator.Interface.User22;

public class User2 extends User22 {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("User2 exe~");
    }
}
