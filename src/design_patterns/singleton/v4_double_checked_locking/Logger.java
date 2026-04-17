package design_patterns.singleton.v4_double_checked_locking;

import java.io.Serializable;

public class Logger implements Serializable {
    private static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {

        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }

        return instance;
    }
}

// 1. Reflection/serialization can still break singleton rules unless extra
// safeguards are added.
