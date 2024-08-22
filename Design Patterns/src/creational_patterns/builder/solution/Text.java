package creational_patterns.builder.solution;

public class Text implements Element {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
