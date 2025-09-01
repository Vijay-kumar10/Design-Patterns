public class PaypalPayment implements PaymentStrategy {
     @Override
    public void pay(Double amount) {
        System.out.println("Rs. "+amount+" pay with Paypay.");
    } 
}
