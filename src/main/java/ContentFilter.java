public class ContentFilter implements LoggerFilter {

    public boolean filter(String message) {
        return (message.toLowerCase().contains("message"));
    }
}
