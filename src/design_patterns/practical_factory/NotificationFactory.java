package design_patterns.practical_factory;

public class NotificationFactory {

    public INotification createObject(String input) {

        if (input.equalsIgnoreCase("SMS")) {
            return new SMS();
        } else if (input.equalsIgnoreCase("Email")) {
            return new Email();
        } else {
            throw new IllegalArgumentException("Incorrect input");
        }
    }
}
