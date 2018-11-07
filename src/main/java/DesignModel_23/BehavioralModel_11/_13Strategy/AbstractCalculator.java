package DesignModel_23.BehavioralModel_11._13Strategy;

/**
 * 辅助类
 */
public abstract class AbstractCalculator {

    /**
     * @param exp 计算公式（含操作符与操作数）
     * @param opt 操作符号
     * @return 操作数的数组
     */
    public int[] split(String exp, String opt) {
        String[] array = exp.split(opt);
        int[] arrayInt = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);

        return arrayInt;
    }
}
