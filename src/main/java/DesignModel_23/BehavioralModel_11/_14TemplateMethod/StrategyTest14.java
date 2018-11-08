package DesignModel_23.BehavioralModel_11._14TemplateMethod;

import DesignModel_23.BehavioralModel_11._13Strategy.AbstractCalculator;

/**
 * 在AbstractCalculator类中定义一个主方法calculate，
 * calculate()调用spilt()等，
 * Plus和Minus分别继承AbstractCalculator类，
 * 通过对AbstractCalculator的调用实现对子类的调用。
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
