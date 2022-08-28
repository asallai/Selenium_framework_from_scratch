package theory.factory.payment;

public class RevolutPay implements Payable {

    @Override
    public void pay() {
        System.out.println("Revolut Pay");
    }
}
