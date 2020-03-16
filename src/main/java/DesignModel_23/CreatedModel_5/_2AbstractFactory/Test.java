package DesignModel_23.CreatedModel_5._2AbstractFactory;

import DesignModel_23.CreatedModel_5._2AbstractFactory.provider.impl.SendSmsFactory;
import DesignModel_23.CreatedModel_5._2AbstractFactory.provider.impl.SendMailFactory;
import DesignModel_23.CreatedModel_5._2AbstractFactory.provider.Provider;
import DesignModel_23.CreatedModel_5._2AbstractFactory.sender.Sender;

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
