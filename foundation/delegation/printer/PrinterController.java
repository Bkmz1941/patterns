package foundation.delegation.printer;

public class PrinterController implements Printable {
    private final Printable delegate;

    public PrinterController(Printable printer) {
        this.delegate = printer;
    }

    @Override
    public void print(String message) {
        delegate.print(message);
    }
}