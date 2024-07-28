package behavioral_patterns.mediator.solution;

public class UICheckbox extends UIBase {
    private boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        this.notifyEventHandlers();
    }
}
