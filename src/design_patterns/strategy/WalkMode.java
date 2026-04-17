package design_patterns.strategy;

public class WalkMode implements IGoogleMapPathStrategy {

    @Override
    public void findPath() {
        System.out.println("Path for Walk");
    }

}
