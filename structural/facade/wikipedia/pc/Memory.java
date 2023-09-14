package structural.facade.wikipedia.pc;

public class Memory {
    public void load(long position, char data) {
        System.out.println("position: " + position + ", data: " + data);
        System.out.println("loading...");
    }
}
