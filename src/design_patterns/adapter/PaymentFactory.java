package design_patterns.adapter;

public class PaymentFactory {

    IPaymentGateway createObject(String paymentGateway) {
        if (paymentGateway.equalsIgnoreCase("paypal")) {
            return new PayPal();
        } else if (paymentGateway.equalsIgnoreCase("razorpay")) {
            return new Razorpay();
        } else {
            throw new IllegalArgumentException("Invalid Input");
        }
    }
}
