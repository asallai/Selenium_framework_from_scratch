package theory.factoryExample.payment;

public class ApplePay implements Payable {

    @Override
    public void pay() {
        System.out.println("Apple Pay");
    }
}
