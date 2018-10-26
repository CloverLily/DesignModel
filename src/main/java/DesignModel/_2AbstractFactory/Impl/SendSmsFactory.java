package DesignModel._2AbstractFactory.Impl;

import DesignModel._2AbstractFactory.Interface.Provider;
import DesignModel._2AbstractFactory.Interface.Sender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
