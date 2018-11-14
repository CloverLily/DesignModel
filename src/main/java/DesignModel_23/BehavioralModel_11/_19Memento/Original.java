package DesignModel_23.BehavioralModel_11._19Memento;

/**
 * Original类是原始类，里面有需要保存的属性value及创建一个备忘录类，用来保存value值。
 */
public class Original {

    private String value;

    public Original(String value) {
        this.value = value;
    }


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    /**
     * 生成备忘录，存储需要存储的值
     */
    public Memento createMemento() {
        return new Memento(value);
    }

    /**
     * 恢复原始状态
     * @param memento 备忘录
     */
    public void restoreMemeto(Memento memento) {
        this.value = memento.getValue();
    }
}
