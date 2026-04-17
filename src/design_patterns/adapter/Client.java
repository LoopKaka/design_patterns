package design_patterns.adapter;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter payment gateway: ");
        String paymentGateway = sc.next();

        System.out.println("Enter Amount: ");
        int amount = sc.nextInt();

        IPaymentGateway iPaymentGateway = new PaymentFactory().createObject(paymentGateway);
        iPaymentGateway.pay(amount);

    }
}
