package DesignModel_23.CreatedModel_5._1FactoryMethod.StaticFactory;

import DesignModel_23.CreatedModel_5._1FactoryMethod.domain.MailSender;
import DesignModel_23.CreatedModel_5._1FactoryMethod.domain.Sender;
import DesignModel_23.CreatedModel_5._1FactoryMethod.domain.SmsSender;

public class StaticSendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
