package DesignModel_23.StructuralModel_7._7Decorator.impl;

import DesignModel_23.StructuralModel_7._7Decorator.Interface.Sourceable;

/**
 * 装饰Source类的类，与Source实现同一个接口，然后重写Source中的方法实现
 */
public class Decorator implements Sourceable {

    private Sourceable source;

    public Decorator(Sourceable source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("Before decorator~");
        //此处调用实现了Sourceable接口的Source类重写的method()方法,可由此代码保证：Sourceable source= new Source();
        source.method();
        System.out.println("After decorator~");
    }
}
