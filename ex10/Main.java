public class Main {
    public static void main(String[] args) {
        Logger consoleLogger = new ConsoleLogger();
        Logger fileLogger = new FileLogger();
        Logger errorLogger = new ErrorLogger();

        consoleLogger.log("This is an information.", "INFO");
        fileLogger.log("This is a debug information.", "DEBUG");
        errorLogger.log("This is an error information.", "ERROR");
    }
}