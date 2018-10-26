package DesignModel._1FactoryMethod.MultiFactory;

import DesignModel._1FactoryMethod.CommonFactory.Sender;

/**
 * 多个工厂方法模式，
 *
 */
public class FactoryTest {

    public static void main(String[] args) {
        MultiSendFactory factory =new MultiSendFactory();
        Sender sender1=factory.produceMail();
        sender1.send();

        Sender sender2=factory.produceSms();
        sender2.send();
    }
}
