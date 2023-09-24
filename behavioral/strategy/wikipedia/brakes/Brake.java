package behavioral.strategy.wikipedia.brakes;

public class Brake implements IBrakeBehavior {
    public void brake() {
        System.out.println("Simple Brake applied");
    }
}