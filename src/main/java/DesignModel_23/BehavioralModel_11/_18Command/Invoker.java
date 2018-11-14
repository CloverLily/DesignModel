package DesignModel_23.BehavioralModel_11._18Command;

import DesignModel_23.BehavioralModel_11._18Command.Interface.Command;

/**
 * 发布命令的将军（调用者）
 */
public class Invoker {

    //命令
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    /**
     * 将军下令执行命令
     */
    public void action() {
        command.exe();
    }

}
