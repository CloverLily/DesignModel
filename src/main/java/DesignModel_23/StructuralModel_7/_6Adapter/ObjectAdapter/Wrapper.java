package DesignModel_23.StructuralModel_7._6Adapter.ObjectAdapter;

import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Source;
import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Targetable;

public class Wrapper implements Targetable {
    //Source类实例
    private Source source;

    public Wrapper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is the targetable method~");
    }
}
