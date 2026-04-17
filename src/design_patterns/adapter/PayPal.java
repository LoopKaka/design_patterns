package design_patterns.adapter;

import design_patterns.adapter.thirdpartySDK.PayPalSDK;

public class PayPal implements IPaymentGateway {

    @Override
    public void pay(int amount) {
        PayPalSDK sdk = new PayPalSDK();
        sdk.makePayment(amount);
    }

}
