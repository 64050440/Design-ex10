
public class ErrorLogger implements Logger {
    @Override
    public void log(String message, String level) {
        if (level.equals("INFO")) {
            // Do nothing
        } else if (level.equals("DEBUG")) {
            // Do nothing
        } else if (level.equals("ERROR")) {
            System.out.println("Standard Console::Logger: " + message);
            System.out.println("File::Logger: " + message);
            System.out.println("Error Console::Logger: " + message);
        }
    }
}
