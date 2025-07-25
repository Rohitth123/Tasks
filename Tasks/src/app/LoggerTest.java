package app;

import log.AppLogger;
import log.Logger;

public class LoggerTest {
    public static void main(String[] args) {
        AppLogger logger = new AppLogger();
        logger.logInfo();        // Calls default method
        Logger.logError();       // Calls static method
    }
}
