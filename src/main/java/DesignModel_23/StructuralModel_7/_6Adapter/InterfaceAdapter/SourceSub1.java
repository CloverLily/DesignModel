package DesignModel_23.StructuralModel_7._6Adapter.InterfaceAdapter;

/**
 * 继承抽象类，实现其中一部分方法
 */
public class SourceSub1 extends Wrapper2 {
    @Override
    public void method1(){
        System.out.println("The Sourceable interface's first Sub1~");
    }
}
