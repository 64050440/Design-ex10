
public class FileLogger implements Logger {
    @Override
    public void log(String message, String level) {
        if (level.equals("INFO")) {
            // Do nothing
        } else if (level.equals("DEBUG")) {
            System.out.println("File::Logger: " + message);
        } else if (level.equals("ERROR")) {
            System.out.println("File::Logger: " + message);
        }
    }
}
