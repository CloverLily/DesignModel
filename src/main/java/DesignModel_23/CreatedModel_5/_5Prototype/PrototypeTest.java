package DesignModel_23.CreatedModel_5._5Prototype;

import java.io.IOException;

public class PrototypeTest {
    public static void main(String[] args){
        try{
            Prototype prototype = new Prototype();
            String string = "prototype";
            prototype.setString(string);
            SerializableObject serializableObject = new SerializableObject();
            serializableObject.setDesc("serializableObject");
            prototype.setObj(serializableObject);
            System.out.println("jsonString:"+prototype.toJsonString());
            System.out.println("string:"+prototype.toString());

            //浅复制
            Prototype prototype1 = (Prototype) prototype.clone();
            System.out.println("clone-jsonString:"+prototype1.toJsonString());
            System.out.println("clone-string:"+prototype1.toString());
            //深复制
            Prototype prototype2 = (Prototype) prototype.deepClone();
            System.out.println("deepClone-jsonString:"+prototype2.toJsonString());
            System.out.println("deepClone-string:"+prototype2.toString());

            System.out.println("------update prototype------");
            //修改原类型
            SerializableObject serializableObject2 = new SerializableObject();
            serializableObject2.setDesc("serializableObject2");
            prototype.setObj(serializableObject2);
            string = "prototype2";
            prototype.setString(string);

            System.out.println("clone-jsonString:"+prototype1.toJsonString());
            System.out.println("clone-string:"+prototype1.toString());
            System.out.println("deepClone-jsonString:"+prototype2.toJsonString());
            System.out.println("deepClone-string:"+prototype2.toString());

        } catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException");
        } catch (IOException e){
            System.out.println("IOException");
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
        }
    }
}
