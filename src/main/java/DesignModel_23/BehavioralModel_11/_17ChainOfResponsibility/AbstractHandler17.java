package DesignModel_23.BehavioralModel_11._17ChainOfResponsibility;

import DesignModel_23.BehavioralModel_11._17ChainOfResponsibility.Interface.Handler17;

/**
 * Abstracthandler类提供了get和set方法，方便MyHandler类设置和修改引用对象，
 * MyHandler类是核心，实例化后生成一系列相互持有的对象，构成一条链。
 */
public class AbstractHandler17 {

    private Handler17 handler17;

    public Handler17 getHandler17() {
        return handler17;
    }

    public void setHandler17(Handler17 handler17) {
        this.handler17 = handler17;
    }


}
