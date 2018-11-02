package DesignModel_23.StructuralModel_7._6Adapter.ObjectAdapter;

import DesignModel_23.StructuralModel_7._6Adapter.Source6;
import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Interface.Targetable;

/**
 * 对象的适配器模式
 * 通过在适配器类中获取一个类的实例（而不是直接继承这个类）来达到继承的作用，
 * 其他与类的适配器模式雷同
 *
 */
public class ObjectAdapterTest {

    public static void main(String[] args) {
        Source6 source6_1 = new Source6();
        Targetable targetable = new Wrapper(source6_1);
        targetable.method1();
        targetable.method2();
    }
}
