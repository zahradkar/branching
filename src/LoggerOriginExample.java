import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerOriginExample {
    private static final Logger logger = java.util.logging.Logger.getLogger(LoggerOriginExample.class.getName());

    /*
    SEVERE: A severe error that indicates a problem that may prevent the application from continuing.
    WARNING: A warning that indicates a potential problem.
    INFO: A general information message.
    DEBUG: A detailed debug message.
    TRACE: A very detailed debug message.’
     */
    public static void main(String[] args) {
        info();
        severe();
    }

    private static void info() {
        for (int i = 32; i < 128; i++)
            logger.log(Level.INFO, i + "=" + (char) i);
    }

    private static void severe() {
        for (int i = 32; i < 128; i++)
            logger.log(Level.SEVERE, i + "=" + (char) i);
    }
}
