package DesignModel_23.StructuralModel_7._6Adapter.ClassAdapter;

public class ClassAdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Adapter();
        //继承自Source类中的方法
        targetable.method1();
        //适配后的方法
        targetable.method2();
    }
}
