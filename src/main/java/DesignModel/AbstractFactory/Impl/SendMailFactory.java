package DesignModel.AbstractFactory.Impl;

import DesignModel.AbstractFactory.Interface.Provider;
import DesignModel.AbstractFactory.Interface.Sender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
