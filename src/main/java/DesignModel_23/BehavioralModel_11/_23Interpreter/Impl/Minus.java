package DesignModel_23.BehavioralModel_11._23Interpreter.Impl;

import DesignModel_23.BehavioralModel_11._23Interpreter.Context23;
import DesignModel_23.BehavioralModel_11._23Interpreter.Interface.Expression;

public class Minus implements Expression {

    @Override
    public int interpret(Context23 context) {
        return context.getNum1()-context.getNum2();
    }
}
