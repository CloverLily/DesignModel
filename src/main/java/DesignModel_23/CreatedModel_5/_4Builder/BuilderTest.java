package DesignModel_23.CreatedModel_5._4Builder;

import DesignModel_23.CreatedModel_5._4Builder.Interface.Sender;

import java.util.List;

public class BuilderTest {

    public static void main(String[] args) {
        Builder builder = new Builder();
        List<Sender> mailSenderList = builder.produceMailSender(10);

        for (Sender mailSender : mailSenderList) {
            mailSender.send();
        }

        List<Sender> smsSenderList = builder.produceSmsSender(10);

        for (Sender smsSender : smsSenderList) {
            smsSender.send();
        }

    }
}
