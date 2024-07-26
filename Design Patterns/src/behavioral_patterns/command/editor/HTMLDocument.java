package behavioral_patterns.command.editor;

public class HTMLDocument {
    private String content;

    public HTMLDocument(String content) {
        this.content = content;
    }
    public void makeBold() {
        this.content = "<b>" + this.content + "</b>";
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
