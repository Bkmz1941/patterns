package foundation.delegation.printer;

public class EpsonPrinter implements Printable {
    @Override
    public void print(String message) {
        System.out.println("Epson Printer: " + message);
    }
}
