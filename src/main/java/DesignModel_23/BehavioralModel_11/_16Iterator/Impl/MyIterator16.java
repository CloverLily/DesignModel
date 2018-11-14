package DesignModel_23.BehavioralModel_11._16Iterator.Impl;

import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Collection16;
import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Iterator16;

public class MyIterator16 implements Iterator16 {

    private Collection16 collection16;
    private int pos = -1;

    public MyIterator16(Collection16 collection16) {
        this.collection16 = collection16;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return collection16.get(pos);
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object first() {
        return null;
    }
}
