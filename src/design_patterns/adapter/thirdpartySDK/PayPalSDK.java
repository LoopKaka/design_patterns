package design_patterns.adapter.thirdpartySDK;

public class PayPalSDK {
    public void makePayment(int amount) {
        System.out.println("Paid ₹" + amount + " via PayPal.");
    }
}
