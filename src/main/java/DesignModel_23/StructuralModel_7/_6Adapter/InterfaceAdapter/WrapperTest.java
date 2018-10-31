package DesignModel_23.StructuralModel_7._6Adapter.InterfaceAdapter;

/**
 * 接口适配器模式测试：
 * 抽象类实现接口，
 * 通过抽象类的不同子类进行适配
 */
public class WrapperTest {

    public static void main(String[] args) {
        Sourceable sourceable1=new SourceSub1();
        Sourceable sourceable2= new SourceSub2();

        sourceable1.method1();
        sourceable1.method2();

        sourceable2.method1();
        sourceable2.method2();
    }
}
