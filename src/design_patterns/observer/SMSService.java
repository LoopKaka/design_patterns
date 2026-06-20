package design_patterns.observer;

public class SMSService implements OrderPlacedObserver {
    private void sendSMS() {
        System.out.println("Send SMS");
    }

    @Override
    public void orderPlaced() {
        sendSMS();
    }
}
