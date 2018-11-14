package DesignModel_23.BehavioralModel_11._16Iterator.Impl;

import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Collection16;
import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Iterator16;

public class MyCollection16 implements Collection16 {

    public String[] string = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator16 iterator() {
        return new MyIterator16(this);
    }

    @Override
    public Object get(int i) {
        return string[i];
    }

    @Override
    public int size() {
        return string.length;
    }
}
