package DesignModel_23.BehavioralModel_11._13Strategy.impl;


import DesignModel_23.BehavioralModel_11._13Strategy.AbstractCalculator;
import DesignModel_23.BehavioralModel_11._13Strategy.Interface.ICalculator;

/**
 * 乘法实现类
 */
public class Multiply13 extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "\\*");
        return arrayInt[0] * arrayInt[1];
    }
}
