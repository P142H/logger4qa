import java.util.Date;

public class TimestampMessageLoggerFormatter implements LoggerFormatter {
    public String format(String message) {
        return new Date() + message;
    }
}
