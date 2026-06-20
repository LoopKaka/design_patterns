package design_patterns.observer;

public class Client {
    public static void main(String[] args) {
        EmailService email = new EmailService();
        InvoiceService invoice = new InvoiceService();
        SMSService sms = new SMSService();

        Amazon amazon = new Amazon();

        System.out.println("=== 1st Run ===");
        amazon.addObserver(email);
        amazon.addObserver(invoice);
        amazon.addObserver(sms);

        amazon.orderPlacedNotification();

        System.out.println("=== 2nd Run ===");
        amazon.removeObserver(sms);
        amazon.orderPlacedNotification();
    }
}
