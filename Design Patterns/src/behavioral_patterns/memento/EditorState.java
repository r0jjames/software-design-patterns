package behavioral_patterns.memento;

public class EditorState {
    private String content;
    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
