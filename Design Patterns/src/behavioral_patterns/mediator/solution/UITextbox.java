package behavioral_patterns.mediator.solution;

public class UITextbox extends UIBase {
    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.notifyEventHandlers();
    }
}
