package behavioral.visitor.wikipedia.visitor;

import behavioral.visitor.wikipedia.car_elements.Body;
import behavioral.visitor.wikipedia.car_elements.Car;
import behavioral.visitor.wikipedia.car_elements.Engine;
import behavioral.visitor.wikipedia.car_elements.Wheel;

public interface CarElementVisitor {
    void visit(Body body);
    void visit(Car car);
    void visit(Engine engine);
    void visit(Wheel wheel);
}
