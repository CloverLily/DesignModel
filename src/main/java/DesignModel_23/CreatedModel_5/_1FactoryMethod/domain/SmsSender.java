package DesignModel_23.CreatedModel_5._1FactoryMethod.domain;

import DesignModel_23.CreatedModel_5._1FactoryMethod.domain.Sender;

/**
 * 模拟短信发送器
 */
public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is sms sender~");
    }
}
