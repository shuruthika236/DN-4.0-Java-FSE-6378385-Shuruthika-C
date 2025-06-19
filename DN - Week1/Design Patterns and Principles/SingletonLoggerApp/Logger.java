package SingletonLoggerApp;

import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("Logger Initialized at " + LocalDateTime.now());
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String level, String message) {
        System.out.println("[" + level.toUpperCase() + "] " + LocalDateTime.now() + " - " + message);
    }
}
