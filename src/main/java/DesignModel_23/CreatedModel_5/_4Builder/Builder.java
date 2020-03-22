package DesignModel_23.CreatedModel_5._4Builder;

import DesignModel_23.CreatedModel_5._4Builder.Interface.impl.MailSender;
import DesignModel_23.CreatedModel_5._4Builder.Interface.impl.SmsSender;
import DesignModel_23.CreatedModel_5._4Builder.Interface.Sender;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    public List<Sender> produceMailSender(int count) {
        List<Sender> mailSenderList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            mailSenderList.add(new MailSender());
        }
        return mailSenderList;
    }

    public List<Sender> produceSmsSender(int count) {
        List<Sender> smsSenderList = new ArrayList<>();
        for (int j = 0; j < count; j++) {
            smsSenderList.add(new SmsSender());
        }
        return smsSenderList;
    }
}
