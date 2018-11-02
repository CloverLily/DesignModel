package DesignModel_23.StructuralModel_7._7Decorator.impl;

import DesignModel_23.StructuralModel_7._7Decorator.Interface.Sourceable;

/**
 * 被装饰的类
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("The original method~");
    }
}
