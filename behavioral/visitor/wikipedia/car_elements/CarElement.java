package behavioral.visitor.wikipedia.car_elements;

import behavioral.visitor.wikipedia.visitor.CarElementVisitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}
