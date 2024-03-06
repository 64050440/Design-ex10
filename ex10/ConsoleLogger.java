public class ConsoleLogger implements Logger {
    @Override
    public void log(String message, String level) {
        if (level.equals("INFO")) {
            System.out.println("Standard Console::Logger: " + message);
        } else if (level.equals("DEBUG")) {
            // Do nothing
        } else if (level.equals("ERROR")) {
            System.out.println("Error Console::Logger: " + message);
        }
    }
}
