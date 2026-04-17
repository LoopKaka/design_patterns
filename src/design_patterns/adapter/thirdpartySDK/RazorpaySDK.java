package design_patterns.adapter.thirdpartySDK;

public class RazorpaySDK {
    public void payment(int amount) {
        System.out.println("Paid ₹" + amount + " via Razorpay.");
    }
}
