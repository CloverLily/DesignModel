package DesignModel_23.CreatedModel_5._2AbstractFactory;

import DesignModel_23.CreatedModel_5._2AbstractFactory.Impl.SendSmsFactory;
import DesignModel_23.CreatedModel_5._2AbstractFactory.Impl.SendMailFactory;
import DesignModel_23.CreatedModel_5._2AbstractFactory.Interface.Provider;
import DesignModel_23.CreatedModel_5._2AbstractFactory.Interface.Sender;

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
