package DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory;

import DesignModel_23.CreatedModel_5._1FactoryMethod.domain.Sender;

/**
 * 普通工厂模式
 */
public class FactoryTest {

    public static void main(String[] args) {
        CommonSendFactory factory = new CommonSendFactory();
        Sender sender = factory.produce("sms");
        sender.send();
    }
}
