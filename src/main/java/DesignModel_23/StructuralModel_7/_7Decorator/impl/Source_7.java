package DesignModel_23.StructuralModel_7._7Decorator.impl;

import DesignModel_23.StructuralModel_7._7Decorator.Sourceable_7;

/**
 * 被装饰的类
 */
public class Source_7 implements Sourceable_7 {
    @Override
    public void method() {
        System.out.println("The original method~");
    }
}
