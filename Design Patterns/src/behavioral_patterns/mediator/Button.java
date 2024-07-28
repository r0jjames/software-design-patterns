package behavioral_patterns.mediator;

// Concrete Colleague
public class Button extends UIControl {
    private boolean enabled;
    public Button(DialogBox dialogBox) {
        super(dialogBox);
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        this.owner.changed(this);
    }
}
