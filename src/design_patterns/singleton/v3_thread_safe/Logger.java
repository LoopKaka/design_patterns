package design_patterns.singleton.v3_thread_safe;

public class Logger {
    private static Logger instance = null;

    private Logger() {
    }

    public synchronized static Logger getInstance() {

        // 100 lines of code

        if (instance == null) {
            instance = new Logger();
        }

        // 100 lines of code

        return instance;
    }
}

/**
 * Disadvantages of this singleton implementation:
 * 
 * 1. Lower performance: the whole getInstance() method is synchronized, so
 * every call must acquire a lock even after the object is created.
 * 
 * 2. Reduced scalability: in multi-threaded applications, many threads may
 * wait unnecessarily for the same lock.
 * 
 * 3. Reflection/serialization can still break singleton rules unless extra
 * safeguards are added.
 */