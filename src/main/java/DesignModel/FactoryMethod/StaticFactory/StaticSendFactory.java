package DesignModel.FactoryMethod.StaticFactory;

import DesignModel.FactoryMethod.CommonFactory.MailSender;
import DesignModel.FactoryMethod.CommonFactory.Sender;
import DesignModel.FactoryMethod.CommonFactory.SmsSender;

public class StaticSendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
