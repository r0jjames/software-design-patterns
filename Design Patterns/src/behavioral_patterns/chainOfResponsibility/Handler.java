package behavioral_patterns.chainOfResponsibility;

public abstract class Handler {
    private final Handler next;

    public Handler (Handler handler) {
        this.next = handler;
    }

    public void handle(HttpRequest httpRequest) {
        if (doHandle(httpRequest)) {
            return;
        }
        if (this.next != null) {
            this.next.handle(httpRequest);
        }
    }

    protected abstract boolean doHandle(HttpRequest httpRequest);
}
