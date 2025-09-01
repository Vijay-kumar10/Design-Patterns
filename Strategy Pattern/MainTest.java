public class MainTest {
    public static void main(String[] args) {
        PaymentContext context1 = new PaymentContext(new CreditCardPayment());
        context1.executePayment(522);
        PaymentContext context2 = new PaymentContext(new PaypalPayment());
        context2.executePayment(265);
    }
}
