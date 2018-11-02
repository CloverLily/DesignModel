package DesignModel_23.StructuralModel_7._7Decorator;

import DesignModel_23.StructuralModel_7._7Decorator.Interface.Sourceable;
import DesignModel_23.StructuralModel_7._7Decorator.impl.Decorator;
import DesignModel_23.StructuralModel_7._7Decorator.impl.Source;

public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable decoratedSource = new Decorator(source);
        decoratedSource.method();
    }
}
