package DesignModel.FactoryMethod.MultiFactory;

import DesignModel.FactoryMethod.CommonFactory.MailSender;
import DesignModel.FactoryMethod.CommonFactory.Sender;
import DesignModel.FactoryMethod.CommonFactory.SmsSender;

 class MultiSendFactory {

     Sender produceMail(){
        return new MailSender();
    }

     Sender produceSms(){
        return new SmsSender();
    }
}
