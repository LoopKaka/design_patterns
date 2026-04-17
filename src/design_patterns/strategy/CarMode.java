package design_patterns.strategy;

public class CarMode implements IGoogleMapPathStrategy {

    @Override
    public void findPath() {
        System.out.println("Path for Car");
    }

}
