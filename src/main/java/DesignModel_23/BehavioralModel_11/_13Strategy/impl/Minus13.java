package DesignModel_23.BehavioralModel_11._13Strategy.impl;

import DesignModel_23.BehavioralModel_11._13Strategy.AbstractCalculator;
import DesignModel_23.BehavioralModel_11._13Strategy.ICalculator;

/**
 * 减法实现类
 */
public class Minus13 extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }
}
