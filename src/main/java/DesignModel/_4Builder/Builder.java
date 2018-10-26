package DesignModel._4Builder;

import DesignModel._4Builder.Impl.MailSender;
import DesignModel._4Builder.Impl.SmsSender;
import DesignModel._4Builder.Interface.Sender;

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
