package theory.factory.payment;

public class PayPalPay implements Payable {

    @Override
    public void pay() {
        System.out.println("PayPal Pay");
    }
}
