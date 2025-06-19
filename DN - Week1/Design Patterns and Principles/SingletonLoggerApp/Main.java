package SingletonLoggerApp;

public class Main {
    public static void main(String[] args) {
        AppService service = new AppService();
        DatabaseManager dbManager = new DatabaseManager();

        service.performService();
        dbManager.connect();

        Logger logger = Logger.getInstance();
        logger.log("error", "Simulated error log");
    }
}
