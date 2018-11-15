package DesignModel_23.BehavioralModel_11._23Interpreter;

import DesignModel_23.BehavioralModel_11._23Interpreter.Impl.Minus;
import DesignModel_23.BehavioralModel_11._23Interpreter.Impl.Plus;

public class InterpreterTest {

    public static void main(String[] args) {

        int num1, num2, num3;
        num1 = 10;
        num2 = 3;
        num3 = 5;

        //计算num1+num2-num3
        int result = new Minus().interpret(new Context23(new Plus().interpret(new Context23(num1, num2)), num3));
        System.out.println(result);
    }
}
