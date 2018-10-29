package DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory;

public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("This is mailsender~");
    }
}
