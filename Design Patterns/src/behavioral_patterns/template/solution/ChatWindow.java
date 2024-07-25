package behavioral_patterns.template.solution;

public class ChatWindow extends Window{
    @Override
    protected void onClosing() {
        System.out.println("onClosing...ChatWindow");
    }

    @Override
    protected void onClosed() {
        System.out.println("onClosed...ChatWindow");
    }
}
