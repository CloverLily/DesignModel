package DesignModel_23.CreatedModel_5._5Prototype;

import java.io.IOException;

public class PrototypeTest {
    public static void main(String[] args){
        try{
            Prototype prototype = new Prototype();
            prototype.setString("prototype");
            SerializableObject serializableObject = new SerializableObject();
            serializableObject.setDesc("serializableObject");
            prototype.setObj(serializableObject);
            System.out.println("jsonString:"+prototype.toJsonString());
            System.out.println("string:"+prototype.toString());

            //浅复制
            Prototype prototype1 = (Prototype) prototype.clone();
            System.out.println("jsonString:"+prototype1.toJsonString());
            System.out.println("string:"+prototype1.toString());
            //深复制
            Prototype prototype2 = (Prototype) prototype.deepClone();
            System.out.println("jsonString:"+prototype2.toJsonString());
            System.out.println("string:"+prototype2.toString());
        } catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException");
        } catch (IOException e){
            System.out.println("IOException");
        } catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException");
        }
    }
}
