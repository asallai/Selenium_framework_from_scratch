package theory.factory.payment;

public class PaymentFactory {

    public Payable choosePayment(String payMethod) {

        if(payMethod == "apple") {
            return new ApplePay();
        } else if(payMethod == "paypal") {
            return new PayPalPay();
        } else {
            return new RevolutPay();
        }
    }
}
