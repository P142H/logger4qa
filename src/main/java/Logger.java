
class Logger {

    private LoggerFilter filter;
    private LoggerSaver saver;
    private LoggerFormatter formatter;

    // DI - dependency injection (реализация ложится на вызывающую сторону, в данном случае на тест LoggerTest)
    Logger(LoggerFilter filter, LoggerSaver saver, LoggerFormatter formatter) {
        this.filter = filter;
        this.saver = saver;
        this.formatter = formatter;
    }

    public void log(String message) {
        if (filter.filter(message))
            saver.save(formatter.format(message));
    }
}
