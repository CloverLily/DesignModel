package DesignModel_23.StructuralModel_7._6Adapter.ObjectAdapter;

import DesignModel_23.StructuralModel_7._6Adapter.Source6;
import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Interface.Targetable;

public class Wrapper implements Targetable {
    //Source类实例
    private Source6 source61;

    public Wrapper(Source6 source61) {
        super();
        this.source61 = source61;
    }

    @Override
    public void method1() {
        source61.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method~");
    }
}
