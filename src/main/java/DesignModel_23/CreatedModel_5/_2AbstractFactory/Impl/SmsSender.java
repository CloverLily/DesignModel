package DesignModel_23.CreatedModel_5._2AbstractFactory.Impl;

import DesignModel_23.CreatedModel_5._2AbstractFactory.Interface.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is SmsSender");
    }
}
