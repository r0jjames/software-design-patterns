package behavioral_patterns.chainOfResponsibility;

public class Encryptor extends Handler {
    public Encryptor(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(HttpRequest httpRequest) {
        System.out.println("Encrypt");
        return false;
    }
}
