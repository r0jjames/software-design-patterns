package behavioral_patterns.mediator.withoberserver;

// Concrete Colleague
public class UITextBox extends UIController {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyHandlers();
    }
}
