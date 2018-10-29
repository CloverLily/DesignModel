package DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory;

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is sms sender~");
    }
}
