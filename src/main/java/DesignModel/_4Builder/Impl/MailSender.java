package DesignModel._4Builder.Impl;

import DesignModel._4Builder.Interface.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is MailSender~");
    }
}
