package DesignModel._1FactoryMethod.CommonFactory;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is sms sender~");
    }
}
