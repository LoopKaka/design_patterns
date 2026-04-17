package design_patterns.strategy;

public class GoogleMapContext {
    private IGoogleMapPathStrategy iGoogleMapPathStrategy;

    public void setStrategy(IGoogleMapPathStrategy iGoogleMapPathStrategy) {
        this.iGoogleMapPathStrategy = iGoogleMapPathStrategy;
    }

    public void findPath() {
        this.iGoogleMapPathStrategy.findPath();
    }
}
