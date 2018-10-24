package DesignModel.AbstractFactory.Impl;

import DesignModel.AbstractFactory.Interface.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is SmsSender");
    }
}
