package design_patterns.singleton.v1_lazy_initialization;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        System.out.println(logger.hashCode());

        Logger logger1 = Logger.getInstance();
        System.out.println(logger1.hashCode());
    }
}
