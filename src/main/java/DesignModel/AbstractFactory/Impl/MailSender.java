package DesignModel.AbstractFactory.Impl;

import DesignModel.AbstractFactory.Interface.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is MailSender~");
    }
}
