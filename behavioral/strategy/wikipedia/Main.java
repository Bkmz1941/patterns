package behavioral.strategy.wikipedia;

import behavioral.strategy.wikipedia.brakes.Brake;
import behavioral.strategy.wikipedia.cars.Car;
import behavioral.strategy.wikipedia.cars.SUV;
import behavioral.strategy.wikipedia.cars.Sedan;

public class Main {
    public static void main(String[] args) {
        Car sedanCar = new Sedan();
        sedanCar.applyBrake();

        Car suvCar = new SUV();
        suvCar.applyBrake();

        suvCar.setBrakeBehavior(new Brake());
        suvCar.applyBrake();
    }
}
