package behavioral_patterns.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(HttpRequest httpRequest) {
        System.out.println("Authenticate");
        return !(httpRequest.getUsername().equals("admin") && httpRequest.getPassword().equals("1234"));

    }
}
