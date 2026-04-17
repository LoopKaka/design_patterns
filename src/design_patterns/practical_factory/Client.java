package design_patterns.practical_factory;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter notification medium: ");
        String input = sc.next();

        NotificationFactory notificationFactory = new NotificationFactory();
        INotification notification = notificationFactory.createObject(input);
        notification.send();
    }
}
