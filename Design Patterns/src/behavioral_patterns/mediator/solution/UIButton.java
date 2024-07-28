package behavioral_patterns.mediator.solution;

public class UIButton extends UIBase {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        this.notifyEventHandlers();
    }
}
