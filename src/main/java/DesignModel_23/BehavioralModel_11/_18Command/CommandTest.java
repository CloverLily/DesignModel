package DesignModel_23.BehavioralModel_11._18Command;

import DesignModel_23.BehavioralModel_11._18Command.Impl.MyCommand;
import DesignModel_23.BehavioralModel_11._18Command.Interface.Command;

public class CommandTest {

    public static void main(String[] args) {
        //士兵
        Receiver receiver = new Receiver();
        //带着士兵的命令
        Command command = new MyCommand(receiver);
        //带着命令的将军
        Invoker invoker = new Invoker(command);
        //将军下达执行命令指令，命令调用士兵执行相关操作
        invoker.action();
    }
}
