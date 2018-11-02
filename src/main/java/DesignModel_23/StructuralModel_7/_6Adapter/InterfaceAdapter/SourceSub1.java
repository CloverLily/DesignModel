package DesignModel_23.StructuralModel_7._6Adapter.InterfaceAdapter;

import DesignModel_23.StructuralModel_7._6Adapter.InterfaceAdapter.impl.Wrapper6;

/**
 * 继承抽象类，实现其中一部分方法
 */
public class SourceSub1 extends Wrapper6 {
    @Override
    public void method1(){
        System.out.println("The Sourceable_8 interface's first Sub1~");
    }
}
