package DesignModel._1FactoryMethod.MultiFactory;

import DesignModel._1FactoryMethod.CommonFactory.MailSender;
import DesignModel._1FactoryMethod.CommonFactory.Sender;
import DesignModel._1FactoryMethod.CommonFactory.SmsSender;

public class MultiSendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
