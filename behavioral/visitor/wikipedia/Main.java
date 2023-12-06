package behavioral.visitor.wikipedia;

import behavioral.visitor.wikipedia.car_elements.Car;
import behavioral.visitor.wikipedia.visitor.CarElementDoVisitor;
import behavioral.visitor.wikipedia.visitor.CarElementPrintVisitor;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
