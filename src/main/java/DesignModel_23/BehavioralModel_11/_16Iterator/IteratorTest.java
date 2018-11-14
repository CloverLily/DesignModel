package DesignModel_23.BehavioralModel_11._16Iterator;

import DesignModel_23.BehavioralModel_11._16Iterator.Impl.MyCollection16;
import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Collection16;
import DesignModel_23.BehavioralModel_11._16Iterator.Interface.Iterator16;

public class IteratorTest {

    public static void main(String[] args) {
        Collection16 collection16 = new MyCollection16();
        Iterator16 iterator16 = collection16.iterator();

        //依次输出集合中元素
        while (iterator16.hasNext()) {
            System.out.println(iterator16.next());
        }

    }
}
/**
 * 此处我们似乎模拟了一个集合类的过程，
 * 其实JDK中各个类也都是这些基本的东西，加一些设计模式，再加一些优化放到一起的，
 * 只要我们把这些东西学会了，掌握好了，我们也可以写出自己的集合类，甚至框架！
 */
