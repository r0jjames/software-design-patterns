package behavioral_patterns.chainOfResponsibility;

public class WebServer {
    private Handler handler;

    public WebServer(Handler handler) {
        this.handler = handler;
    }

    public void handle(HttpRequest httpRequest) {
        this.handler.handle(httpRequest);
    }
}
