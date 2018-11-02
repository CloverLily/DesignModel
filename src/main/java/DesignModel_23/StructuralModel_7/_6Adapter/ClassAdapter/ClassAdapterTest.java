package DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter;

import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Interface.Targetable;
import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.impl.Adapter;

/**
 * 类的适配器模式
 * 适配器类继承一个类，实现一个接口
 * （其中被继承的类已经实现了被实现接口的一些方法，并且是我们需要的实现方法）
 * 在适配器类中，实现其余的方法；
 * 通过接口调用这个适配器类进行适配
 */
public class ClassAdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        //继承自Source类中的方法
        targetable.method1();
        //适配后的方法
        targetable.method2();
    }
}
