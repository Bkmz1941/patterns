package behavioral.visitor.wikipedia.visitor;

import behavioral.visitor.wikipedia.car_elements.Body;
import behavioral.visitor.wikipedia.car_elements.Car;
import behavioral.visitor.wikipedia.car_elements.Engine;
import behavioral.visitor.wikipedia.car_elements.Wheel;

public class CarElementPrintVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting engine");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.getName() + " wheel");
    }
}
