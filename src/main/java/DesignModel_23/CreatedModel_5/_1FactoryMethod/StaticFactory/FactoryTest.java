package DesignModel_23.CreatedModel_5._1FactoryMethod.StaticFactory;

import DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory.Sender;

/**
 * 静态工厂模式
 */
public class FactoryTest {

    public static void main(String[] args) {
        //调用mail静态方法
        Sender sender1 = StaticSendFactory.produceMail();
        sender1.send();

        //调用sms静态方法
        Sender sender2 = StaticSendFactory.produceSms();
        sender2.send();
    }
}
