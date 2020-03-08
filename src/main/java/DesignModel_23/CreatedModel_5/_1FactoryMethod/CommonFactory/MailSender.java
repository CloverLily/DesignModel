package DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory;

/**
 * 模拟邮件发送器
 */
public class MailSender implements Sender {

    @Override
    public void send() {
        System.out.println("This is mailsender~");
    }
}
