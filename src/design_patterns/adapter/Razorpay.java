package design_patterns.adapter;

import design_patterns.adapter.thirdpartySDK.RazorpaySDK;

public class Razorpay implements IPaymentGateway {

    @Override
    public void pay(int amount) {
        RazorpaySDK sdk = new RazorpaySDK();
        sdk.payment(amount);
    }

}
