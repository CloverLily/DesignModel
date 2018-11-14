package DesignModel_23.BehavioralModel_11._16Iterator.Impl;

import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Collection16;
import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Iterator16;

/**
 * 自定义迭代器
 */
public class MyIterator16 implements Iterator16 {

    private Collection16 collection16;
    private int pos = -1;

    public MyIterator16(Collection16 collection16) {
        this.collection16 = collection16;
    }

    /**
     * 返回集合中上一个元素
     *
     * @return
     */
    @Override
    public Object previous() {
        if (pos > 0) {
            pos--;
        }
        return collection16.get(pos);
    }

    /**
     * 返回集合中下一个元素
     *
     * @return
     */
    @Override
    public Object next() {
        if (pos < collection16.size() - 1) {
            pos++;
        }
        return collection16.get(pos);
    }

    /**
     * 判断集合中是否存在下一个元素
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return pos < (collection16.size() - 1);
    }

    /**
     * 获得集合中第一个元素
     *
     * @return
     */
    @Override
    public Object first() {
        pos = 0;
        return collection16.get(pos);
    }
}
