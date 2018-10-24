package DesignModel.AbstractFactory;

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
