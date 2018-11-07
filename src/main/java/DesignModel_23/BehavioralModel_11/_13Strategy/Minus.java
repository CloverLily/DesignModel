package DesignModel_23.BehavioralModel_11._13Strategy;

/**
 * 减法实现类
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int[] arrayInt = split(exp, "-");
        return arrayInt[0] - arrayInt[1];
    }
}
