package DesignModel._1FactoryMethod.StaticFactory;

import DesignModel._1FactoryMethod.CommonFactory.MailSender;
import DesignModel._1FactoryMethod.CommonFactory.Sender;
import DesignModel._1FactoryMethod.CommonFactory.SmsSender;

public class StaticSendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }

}
