package behavioral_patterns.mediator.withoberserver;

// Concrete Colleague
public class UIListBox extends UIController {
    private String selection;
    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        this.notifyHandlers();
    }


}
