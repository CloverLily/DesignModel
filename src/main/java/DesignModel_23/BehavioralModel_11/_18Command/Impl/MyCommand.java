package DesignModel_23.BehavioralModel_11._18Command.Impl;

import DesignModel_23.BehavioralModel_11._18Command.Interface.Command;
import DesignModel_23.BehavioralModel_11._18Command.Receiver;

/**
 * 命令
 */
public class MyCommand implements Command {

    //士兵（被调用者）
    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 命令调用士兵，士兵执行命令
     */
    @Override
    public void exe() {
        receiver.action();
    }
}
