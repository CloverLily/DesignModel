package DesignModel_23.CreatedModel_5._1FactoryMethod.CommonFactory;

/**
 * 模拟发送器工厂
 *
 */
public class CommonSendFactory {

    public Sender produce(String type) {
        if ("mail".equals(type)) {
            return new MailSender();
        } else if ("sms".equals(type)) {
            return new SmsSender();
        } else {
            System.out.println("Please input correct sender type~");
            return null;
        }
    }


}
