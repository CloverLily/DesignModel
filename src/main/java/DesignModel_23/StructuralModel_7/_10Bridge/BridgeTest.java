package DesignModel_23.StructuralModel_7._10Bridge;

import DesignModel_23.StructuralModel_7._10Bridge.impl.SourceSub1;
import DesignModel_23.StructuralModel_7._10Bridge.impl.SourceSub2;

/**
 * 通过对Bridge类的调用，实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用。
 * JDBC连接的原理就是采用了桥接模式
 */
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();

        //调用第一个对象
        Sourceable10 source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        //调用第二个对象
        Sourceable10 source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
