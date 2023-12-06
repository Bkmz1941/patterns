package foundation.delegation.printer;

public class HpPrinter implements Printable {
    @Override
    public void print(String message) {
        System.out.println("Hp Printer: " + message);
    }
}
