package design_patterns.singleton.v1_lazy_initialization;

public class Logger {
    private static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }
}

// 1. Not thread-safe: if two threads call getInstance() at the same time, more
// than one object can be created.
// 2. Reflection/serialization can still break singleton behavior unless extra
// protection is added.
