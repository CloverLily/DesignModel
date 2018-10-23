package DesignModel.FactoryMethod.MultiFactory;

import DesignModel.FactoryMethod.CommonFactory.MailSender;
import DesignModel.FactoryMethod.CommonFactory.Sender;
import DesignModel.FactoryMethod.CommonFactory.SmsSender;

public class MultiSendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
