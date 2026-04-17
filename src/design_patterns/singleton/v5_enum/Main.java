package design_patterns.singleton.v5_enum;

public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.INSTANCE;
        System.out.println(log1.hashCode());

        Logger log2 = Logger.INSTANCE;
        System.out.println(log2.hashCode());
    }
}
