package log;

public interface Logger {
    default void logInfo() {
        System.out.println("INFO: This is a default log message.");
    }

    static void logError() {
        System.out.println("ERROR: This is a static error log message.");
    }
}
