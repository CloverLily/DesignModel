package DesignModel_23.StructuralModel_7._8Proxy;

import DesignModel_23.StructuralModel_7._8Proxy.impl.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Sourceable_8 source = new Proxy();
        source.method();
    }
}
