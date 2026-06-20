package design_patterns.observer;

public class EmailService implements OrderPlacedObserver {
    private void sendEmail() {
        System.out.println("Send Email");
    }

    @Override
    public void orderPlaced() {
        sendEmail();
    }
}
