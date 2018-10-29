package DesignModel_23.CreatedModel_5._4Builder;

import DesignModel_23.CreatedModel_5._4Builder.Impl.MailSender;
import DesignModel_23.CreatedModel_5._4Builder.Impl.SmsSender;
import DesignModel_23.CreatedModel_5._4Builder.Interface.Sender;

import java.util.ArrayList;
import java.util.List;

public class Builder {

    private List<Sender> list=new ArrayList<>();

    public void produceMailSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(int count){
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}
