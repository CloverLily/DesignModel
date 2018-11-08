package DesignModel_23.BehavioralModel_11._13Strategy;

import DesignModel_23.BehavioralModel_11._13Strategy.Interface.ICalculator;
import DesignModel_23.BehavioralModel_11._13Strategy.impl.Minus13;
import DesignModel_23.BehavioralModel_11._13Strategy.impl.Plus13;

public class StrategyTest13 {
    public static void main(String[] args) {
        String exp1 = "7+9";
        ICalculator cal1 = new Plus13();
        int plusResult1 = cal1.calculate(exp1);
        System.out.println(plusResult1);

        String exp2 = "7-6";
        ICalculator cal2 = new Minus13();
        int plusResult2 = cal2.calculate(exp2);
        System.out.println(plusResult2);


    }
}
