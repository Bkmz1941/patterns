package behavioral.visitor.wikipedia.car_elements;

import behavioral.visitor.wikipedia.visitor.CarElementVisitor;

public class Body implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
