package DesignModel_23.StructuralModel_7._7Decorator;

import DesignModel_23.StructuralModel_7._7Decorator.impl.Decorator;
import DesignModel_23.StructuralModel_7._7Decorator.impl.Source_7;

public class DecoratorTest {

    public static void main(String[] args) {
        Sourceable_7 source = new Source_7();
        Sourceable_7 decoratedSource = new Decorator(source);
        decoratedSource.method();
    }
}
