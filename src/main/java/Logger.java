
class Logger {

    private LoggerFilter filter;
    private LoggerSaver saver;

    // DI - dependency injection (реализация ложится на выхывающую сторону)
    Logger(LoggerFilter filter, LoggerSaver saver) {
        this.filter = filter;
        this.saver = saver;
    }

    public void log(String message) {
        if (filter.filter(message))
            saver.save(message);
    }
}
