package DesignModel_23.CreatedModel_5._1FactoryMethod.StaticFactory;

import DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory.MailSender;
import DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory.Sender;
import DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory.SmsSender;

public class StaticSendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
