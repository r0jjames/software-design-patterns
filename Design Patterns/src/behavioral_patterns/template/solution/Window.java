package behavioral_patterns.template.solution;

public abstract class Window {
    public void close() {
        //TODO: custom windows may need to execute some code before the window
        // is closed.
        onClosing();

        System.out.println("Removing the window from the screen");

        //TODO: custom windows may need to execute some code after the window
        // is closed.
        onClosed();
    }

    protected abstract void onClosing();
    protected abstract void onClosed();
}