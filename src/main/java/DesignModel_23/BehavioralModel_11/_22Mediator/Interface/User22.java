package DesignModel_23.BehavioralModel_11._22Mediator.Interface;

import DesignModel_23.BehavioralModel_11._22Mediator.Interface.Mediator;

public abstract class User22 {

    private Mediator mediator;

    public User22(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void work();
}
