package DesignModel._5Prototype;

import java.io.*;

/**
 * 本小结会通过对象的复制，进行讲解。
 * 在Java中，复制对象是通过clone()实现的，先创建一个原型类：
 *
 */
/**
 * public class Prototype implements Cloneable {
 *
 *     public Object clone() throws CloneNotSupportedException{
 *         Prototype proto = (Prototype) super.clone();
 *         return proto;
 *     }
 *     Date date =new Date();
 * }
 */


/**
 * 深浅复制的例子
 */
public class Prototype implements Cloneable, Serializable{

    private static final long serialVersionUID = 1L;
    private String string;

    private SerializableObject obj;

    //浅复制
    //将一个对象复制后，基本数据类型的变量都会重新创建，而引用类型，指向的还是原对象所指向的。
    public Object clone() throws CloneNotSupportedException{
        Prototype proto =(Prototype) super.clone();
        return  proto;
    }

    //深复制
    //将一个对象复制后，不论是基本数据类型还有引用类型，都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
    public Object deepClone() throws IOException,CloneNotSupportedException{
        //写入当前对象的二进制流
        ByteArrayOutputStream bos= new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(this);

        //读出二进制流产生的新对象
        ByteArrayInputStream bis= new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bis);
        //return ois.readObject();待修改
        return new Object();
    }

}

class SerializableObject implements Serializable{
    private static final long serialVersionUID = 1L;
}

