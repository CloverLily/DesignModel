package DesignModel._2AbstractFactory.Impl;

import DesignModel._2AbstractFactory.Interface.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is SmsSender");
    }
}
