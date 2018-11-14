package DesignModel_23.BehavioralModel_11._20State;

/**
 * 状态类的核心类
 */
public class State {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void method1(){
        System.out.println("Execute the first oprt~");
    }

    public void method2(){
        System.out.println("Execute the second oprt~");
    }
}
