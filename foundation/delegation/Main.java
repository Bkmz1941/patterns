package foundation.delegation;

import foundation.delegation.printer.*;

public class Main {
    public static void main(String[] args) {
        Printable printerCanon = new CanonPrinter();
        Printable printerHP = new HpPrinter();
        Printable printerEpson = new EpsonPrinter();
        PrinterController controller = new PrinterController(printerCanon);
        controller.print("Hello world");
    }
}
