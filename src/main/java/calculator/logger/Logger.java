package calculator.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private final String LOG_INFO = "\u001B[34m";
    private final String LOG_WARNING = "\u001B[33m";
    private final String LOG_ERROR = "\u001B[31m";
    public static final String RESET = "\u001B[0m";

    private String getDate() {
        return new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
    }

    public void info(String msg) {
        System.out.println(LOG_INFO + getDate() + " >>> " + msg + RESET);
    }

    public void error(String msg) {
        System.out.println(LOG_ERROR + getDate() + " >>> " + msg + RESET);
    }

    public void warning(String msg) {
        System.out.println(LOG_WARNING + getDate() + " >>> " + msg + RESET);
    }
}
