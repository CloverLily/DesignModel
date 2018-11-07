package DesignModel_23.BehavioralModel_11._13Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        String exp1 = "7+9";
        ICalculator cal1 = new Plus();
        int plusResult1 = cal1.calculate(exp1);
        System.out.println(plusResult1);

        String exp2 = "7-6";
        ICalculator cal2 = new Minus();
        int plusResult2 = cal2.calculate(exp2);
        System.out.println(plusResult2);


    }
}
