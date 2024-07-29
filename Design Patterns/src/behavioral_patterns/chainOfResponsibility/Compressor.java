package behavioral_patterns.chainOfResponsibility;

public class Compressor extends Handler {

    public Compressor(Handler handler) {
        super(handler);
    }

    @Override
    protected boolean doHandle(HttpRequest httpRequest) {
        System.out.println("Compress");
        return false;
    }
}
