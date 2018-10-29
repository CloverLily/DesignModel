package DesignModel_23.CreatedModel_5._1FactoryMethod.MultiFactory;

import DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory.MailSender;
import DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory.Sender;
import DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory.SmsSender;

public class MultiSendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
