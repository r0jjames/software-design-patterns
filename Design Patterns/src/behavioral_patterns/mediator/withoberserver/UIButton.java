package behavioral_patterns.mediator.withoberserver;

import behavioral_patterns.mediator.DialogBox;

// Concrete Colleague
public class UIButton extends UIController {
    private boolean enabled;

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
        this.notifyHandlers();
    }
}
