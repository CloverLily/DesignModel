package DesignModel_23.CreatedModel_5._2AbstractFactory.Impl;

import DesignModel_23.CreatedModel_5._2AbstractFactory.Interface.Provider;
import DesignModel_23.CreatedModel_5._2AbstractFactory.Interface.Sender;

public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
