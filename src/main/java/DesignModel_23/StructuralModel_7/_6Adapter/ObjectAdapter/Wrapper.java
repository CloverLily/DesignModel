package DesignModel_23.StructuralModel_7._6Adapter.ObjectAdapter;

import DesignModel_23.StructuralModel_7._6Adapter.common.Source6;
import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Targetable;

public class Wrapper implements Targetable {
    //Source类实例
    private Source6 source6_2;

    public Wrapper(Source6 source6_2) {
        super();
        this.source6_2 = source6_2;
    }

    @Override
    public void method1() {
        source6_2.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method from wrapper~");
    }
}
