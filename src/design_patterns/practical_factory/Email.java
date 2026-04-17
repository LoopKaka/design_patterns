package design_patterns.practical_factory;

public class Email implements INotification {

    @Override
    public void send() {
        System.out.println("Notofication sent via Email");
    }

}
