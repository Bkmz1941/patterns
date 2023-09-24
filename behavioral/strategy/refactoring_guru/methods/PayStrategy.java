package behavioral.strategy.refactoring_guru.methods;

public interface PayStrategy {
    boolean pay(int paymentAmount);

    void collectPaymentDetails();
}
