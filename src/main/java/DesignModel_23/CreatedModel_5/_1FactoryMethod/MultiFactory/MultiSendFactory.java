package DesignModel_23.CreatedModel_5._1FactoryMethod.MultiFactory;

import DesignModel_23.CreatedModel_5._1FactoryMethod.domain.MailSender;
import DesignModel_23.CreatedModel_5._1FactoryMethod.domain.Sender;
import DesignModel_23.CreatedModel_5._1FactoryMethod.domain.SmsSender;

public class MultiSendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
