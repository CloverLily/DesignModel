package DesignModel_23.BehavioralModel_11._13Strategy;

import DesignModel_23.BehavioralModel_11._13Strategy.impl.Minus13;
import DesignModel_23.BehavioralModel_11._13Strategy.impl.Multiply13;
import DesignModel_23.BehavioralModel_11._13Strategy.impl.Plus13;

public class StrategyTest13 {
    public static void main(String[] args) {
        String exp1 = "7+9";
        ICalculator cal = new Plus13();
        int plusResult = cal.calculate(exp1);
        System.out.println(plusResult);

        String exp2 = "7-6";
        ICalculator cal2 = new Minus13();
        int minusResult = cal2.calculate(exp2);
        System.out.println(minusResult);

        String exp3 = "3*5";
        ICalculator cal3 = new Multiply13();
        int multiResult = cal3.calculate(exp3);
        System.out.println(multiResult);
    }
}
