package DesignModel_23.StructuralModel_7._7Decorator.impl;

import DesignModel_23.StructuralModel_7._7Decorator.Sourceable_7;

/**
 * 装饰Source类的类，与Source实现同一个接口，然后重写Source中的方法实现
 */
public class Decorator implements Sourceable_7 {

    private Sourceable_7 source;

    public Decorator(Sourceable_7 source) {
        super();
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("Before decorator~");
        //此处调用实现了Sourceable接口的Source类重写的method()方法,可由DecoratorTest中此代码保证： Sourceable_7 source = new Source_7();;
        source.method();
        System.out.println("After decorator~");
    }
}
