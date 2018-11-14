package DesignModel_23.BehavioralModel_11._19Memento;

public class MementoTest {

    public static void main(String[] args) {

        //创建原始类
        Original original = new Original("kitty~");

        //创建备忘录
        Storage storage = new Storage(original.createMemento());

        //修改原始类的状态
        System.out.println("原始状态：" + original.getValue());
        original.setValue("doggy~");
        System.out.println("修改后的状态：" + original.getValue());

        //恢复原始类的状态
        original.restoreMemeto(storage.getMemento());
        System.out.println("恢复后的状态：" + original.getValue());
    }
}

/**
 * 新建原始类时，value被初始化为kitty~，后经过修改，将value的值置为doggy~，
 * 最后倒数第二行进行恢复状态，结果成功恢复为kitty~。这个模式叫“备份-恢复”模式最形象。
 */
