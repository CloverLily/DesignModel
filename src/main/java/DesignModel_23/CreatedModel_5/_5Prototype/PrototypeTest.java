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
            Prototype prototype1 = (Prototype) prototype.deepClone();
            System.out.println(prototype1.getString());
        } catch(ClassNotFoundException e){
            System.out.println("ClassNotFoundException");
        } catch (IOException e){
            System.out.println("IOException");
        }


    }
}
