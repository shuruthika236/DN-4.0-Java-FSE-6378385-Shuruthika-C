package SingletonLoggerApp;

public class DatabaseManager {
    public void connect() {
        Logger logger = Logger.getInstance();
        logger.log("info", "Connecting to database");

        logger.log("debug", "Executing connection string");

        logger.log("info", "Database connection established");
    }
}
