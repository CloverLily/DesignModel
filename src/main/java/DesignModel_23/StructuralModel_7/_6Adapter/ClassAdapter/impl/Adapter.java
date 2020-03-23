package DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.impl;

import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Targetable;
import DesignModel_23.StructuralModel_7._6Adapter.common.Source6;

public class Adapter extends Source6 implements Targetable {

    @Override
    public void method2() {
        System.out.println("This is the targetable method~");

    }
}
