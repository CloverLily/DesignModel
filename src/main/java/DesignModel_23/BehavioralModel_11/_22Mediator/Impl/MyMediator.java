package DesignModel_23.BehavioralModel_11._22Mediator.Impl;

import DesignModel_23.BehavioralModel_11._22Mediator.Interface.Mediator;
import DesignModel_23.BehavioralModel_11._22Mediator.Interface.User22;

public class MyMediator implements Mediator {

    private User22 user1;
    private User22 user2;

    public User22 getUser1() {
        return user1;
    }

    public User22 getUser2() {
        return user2;
    }

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
