package DesignModel._1FactoryMethod.CommonFactory;

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
