package foundation.delegation.printer;

public class CanonPrinter implements Printable {
    @Override
    public void print(String message) {
        System.out.println("Canon Printer: " + message);
    }
}
