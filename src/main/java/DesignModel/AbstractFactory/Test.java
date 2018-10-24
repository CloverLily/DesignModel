package DesignModel.AbstractFactory;

import DesignModel.AbstractFactory.Impl.SendMailFactory;
import DesignModel.AbstractFactory.Impl.SendSmsFactory;
import DesignModel.AbstractFactory.Interface.Provider;
import DesignModel.AbstractFactory.Interface.Sender;

/**
 *抽象工厂模式
 *
 */
public class Test {

    public static void main(String[] args) {
        Provider provider1 = new SendMailFactory();
        Sender sender = provider1.produce();
        sender.send();

        Provider provider2 = new SendSmsFactory();
        sender = provider2.produce();
        sender.send();
    }
}
