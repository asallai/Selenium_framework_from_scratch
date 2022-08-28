package theory.factory.payment;

public class SelectPayment {

    public void choosePayment() {
        PaymentFactory paymentFactory = new PaymentFactory();
        paymentFactory.selectPayment("apple");
    }
}
