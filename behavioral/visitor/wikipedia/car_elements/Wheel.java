package behavioral.visitor.wikipedia.car_elements;

import behavioral.visitor.wikipedia.visitor.CarElementVisitor;

public class Wheel implements CarElement {
    private final String name;

    public Wheel(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
