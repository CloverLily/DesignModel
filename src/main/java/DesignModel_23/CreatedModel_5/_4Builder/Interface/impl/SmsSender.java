package DesignModel_23.CreatedModel_5._4Builder.Interface.impl;

import DesignModel_23.CreatedModel_5._4Builder.Interface.Sender;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is SmsSender:" + this.toString());
    }
}
