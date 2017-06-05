
class Logger {

    private LoggerFilter filter;
    private LoggerSaver saver;

    Logger(LoggerFilter filter, LoggerSaver saver) {
        this.filter = filter;
        this.saver = saver;
    }

    void log(String message) {
        if (filter.filter(message))
            saver.save(message);
    }
}
