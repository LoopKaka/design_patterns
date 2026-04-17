package design_patterns.singleton.v2_eager_initialization;

public class Logger {
    private static Logger instance = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }
}

// 1. Resource Wastage: The instance is created even if the application never
// actually uses it.
// 2. Startup Latency: If the singleton is "heavy" (e.g., establishing a
// database connection), it can slow down application startup.