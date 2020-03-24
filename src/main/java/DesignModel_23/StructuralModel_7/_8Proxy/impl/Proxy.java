package DesignModel_23.StructuralModel_7._8Proxy.impl;

import DesignModel_23.StructuralModel_7._8Proxy.Sourceable_8;

public class Proxy implements Sourceable_8 {

    private Source_8 source8;
    public Proxy(){
        super();
        this.source8 = new Source_8();
    }

    @Override
    public void method() {
        before();
        source8.method();
        after();

    }

    private void before(){
        System.out.println("Before proxy~");
    }

    private void after(){
        System.out.println("After proxy~");
    }
}
