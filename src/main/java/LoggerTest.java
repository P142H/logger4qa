
public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = new Logger(new ContentFilter(), new ConsoleSaver());
        logger.log("Message");
    }
}
