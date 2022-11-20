package theory.factoryExample.payment;

public class SelectPayment {

    public void selectPayment() {
        PaymentFactory paymentFactory = new PaymentFactory();
        paymentFactory.choosePayment("apple");
    }
}
