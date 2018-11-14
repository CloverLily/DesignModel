package DesignModel_23.BehavioralModel_11._22Mediator;

import DesignModel_23.BehavioralModel_11._22Mediator.Impl.MyMediator;
import DesignModel_23.BehavioralModel_11._22Mediator.Interface.Mediator;

public class MediatorTest {

    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
