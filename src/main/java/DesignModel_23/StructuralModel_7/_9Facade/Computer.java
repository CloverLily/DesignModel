package DesignModel_23.StructuralModel_7._9Facade;

import DesignModel_23.StructuralModel_7._9Facade.Classes.CPU;
import DesignModel_23.StructuralModel_7._9Facade.Classes.Disk;
import DesignModel_23.StructuralModel_7._9Facade.Classes.Memory;

public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer(){
        cpu=new CPU();
        memory=new Memory();
        disk = new Disk();
    }

    public void startUp(){
        System.out.println("Start the computer~");
        cpu.startUp();
        memory.startUp();
        disk.startUp();
        System.out.println("Start computer finished~");
    }

    public void shutdown(){
        System.out.println("Begin to close the computer~");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
        System.out.println("Computer closed~");
    }

}
