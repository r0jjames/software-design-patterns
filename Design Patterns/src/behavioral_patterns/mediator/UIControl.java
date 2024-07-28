package behavioral_patterns.mediator;


// Colleague
public class UIControl {
    protected DialogBox owner;
    public UIControl(DialogBox dialogBox) {
        this.owner = dialogBox;
    }
}
