package behavioral.strategy.wikipedia.cars;

import behavioral.strategy.wikipedia.brakes.BrakeWithABS;

public class SUV extends Car {
    public SUV() {
        super(new BrakeWithABS());
    }
}