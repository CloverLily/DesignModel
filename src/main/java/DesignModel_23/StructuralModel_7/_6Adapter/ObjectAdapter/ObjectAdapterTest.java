package DesignModel_23.StructuralModel_7._6Adapter.ObjectAdapter;

import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Source;
import DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter.Targetable;

public class ObjectAdapterTest {

    public static void main(String[] args) {
        Source source = new Source();
        Targetable targetable = new Wrapper(source);
        targetable.method1();
        targetable.method2();
    }
}
