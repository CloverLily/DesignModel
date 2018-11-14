package DesignModel_23.BehavioralModel_11._16Iterator.Impl;

import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Collection16;
import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Iterator16;

public class MyCollection16 implements Collection16 {

    //元素集合
    public String[] string = {"A", "B", "C", "D", "E"};

    /**
     * 返回集合的迭代器
     */
    @Override
    public Iterator16 iterator() {
        return new MyIterator16(this);
    }

    /**
     * 获得指定索引处的元素
     *
     * @param i 索引
     * @return i处的元素
     */
    @Override
    public Object get(int i) {
        return string[i];
    }

    /**
     * 返回集合大小
     */
    @Override
    public int size() {
        return string.length;
    }
}
