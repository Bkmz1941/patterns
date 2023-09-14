package structural.facade.wikipedia.pc;

public class CPU {
    public void freeze() {
        System.out.println("freezing...");
    }

    public void jump(long position) {
        System.out.println("jump to: " + position);
    }

    public void execute() {
        System.out.println("executing...");
    }
}
