package design_patterns.practical_factory;

public class SMS implements INotification {

    @Override
    public void send() {
        System.out.println("Notofication sent via SMS");
    }

}
