package SingletonLoggerApp;

public class AppService {
    public void performService() {
        Logger logger = Logger.getInstance();
        logger.log("info", "Service started");

        
        logger.log("debug", "Processing business logic...");

        logger.log("info", "Service completed");
    }
}
