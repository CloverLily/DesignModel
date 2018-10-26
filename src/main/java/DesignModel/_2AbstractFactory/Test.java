package DesignModel._2AbstractFactory;

import DesignModel._2AbstractFactory.Impl.SendMailFactory;
import DesignModel._2AbstractFactory.Impl.SendSmsFactory;
import DesignModel._2AbstractFactory.Interface.Provider;
import DesignModel._2AbstractFactory.Interface.Sender;

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
