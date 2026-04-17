package design_patterns.strategy;

import java.util.Scanner;

public class GoogleMapClient {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter mode: ");
        String mode = sc.next();

        GoogleMapContext googleMapContext = new GoogleMapContext();

        if (mode.equalsIgnoreCase("car")) {
            googleMapContext.setStrategy(new CarMode());
            googleMapContext.findPath();
        } else if (mode.equalsIgnoreCase("walk")) {
            googleMapContext.setStrategy(new WalkMode());
            googleMapContext.findPath();
        } else {
            throw new IllegalArgumentException("Invalid Input");
        }
    }
}
