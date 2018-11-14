package DesignModel_23.BehavioralModel_11._17ChainOfResponsibility;

import DesignModel_23.BehavioralModel_11._17ChainOfResponsibility.Impl.MyHandler17;

public class ChainOfResponsibilityTest {

    public static void main(String[] args) {
        MyHandler17 handler1 = new MyHandler17("handler1");
        MyHandler17 handler2 = new MyHandler17("handler2");
        MyHandler17 handler3 = new MyHandler17("handler3");

        handler1.setHandler17(handler2);
        handler2.setHandler17(handler3);

        handler1.operator();
    }

    /**
     * 需要强调的是：
     * 链接上的请求可以是一条链，可以是一个树，还可以是一个环，模式本身不约束这个，需要我们自己去实现，
     * 同时，在一个时刻，命令只允许由一个对象传给另一个对象，而不允许传给多个对象。
     */
}
