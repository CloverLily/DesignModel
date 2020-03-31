package DesignModel_23.BehavioralModel_11._14TemplateMethod;

/**
 * 在AbstractCalculator14类中定义一个主方法calculate，
 * calculate()调用spilt()等，
 * Plus14和Minus14分别继承AbstractCalculator14类，
 * 通过对AbstractCalculator14的调用实现对子类的调用。
 *
 * 与策略模式各有特色
 */
public class StrategyTest14 {

    public static void main(String[] args) {
        String exp1 = "9+3";
        AbstractCalculator14 cal1 = new Plus14();
        int result1 = cal1.calculate(exp1,"\\+");
        System.out.println("加法结果："+result1);

        String exp2 = "9-3";
        AbstractCalculator14 cal2 = new Minus14();
        int result2 = cal2.calculate(exp2,"\\-");
        System.out.println("减法结果："+result2);

    }


}
