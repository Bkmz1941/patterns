package behavioral.strategy.wikipedia.cars;

import behavioral.strategy.wikipedia.brakes.Brake;

public class Sedan extends Car {
    public Sedan() {
        super(new Brake());
    }
}