package DesignModel_23.StructuralModel_7._10Bridge;

/**
 * 定义一个桥，持有Sourceable10的一个实例
 */
public abstract class Bridge {
    private Sourceable10 source;

    public void method() {
        source.method();
    }

    public Sourceable10 getSource() {
        return source;
    }

    public void setSource(Sourceable10 source) {
        this.source = source;
    }
}
