package structural.facade.wikipedia;

import structural.facade.wikipedia.pc.CPU;
import structural.facade.wikipedia.pc.HardDrive;
import structural.facade.wikipedia.pc.Memory;

public class ComputerFacade {
    private final CPU cpu;
    private final HardDrive hardDrive;
    private final Memory memory;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.hardDrive = new HardDrive();
        this.memory = new Memory();
    }

    public void start() {
        this.cpu.freeze();
        this.memory.load(1017, 'a');
        this.cpu.jump(1018);
        this.cpu.execute();
    }
}
