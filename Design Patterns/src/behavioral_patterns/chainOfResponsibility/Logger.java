package behavioral_patterns.chainOfResponsibility;

public class Logger extends Handler {
    public Logger(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(HttpRequest httpRequest) {
        System.out.println("Log");
        return false;
    }
}
