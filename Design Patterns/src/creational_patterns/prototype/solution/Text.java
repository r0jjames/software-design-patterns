package creational_patterns.prototype.solution;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public Component clone() {
        Text newText = new Text(content);
        return newText;
    }

    @Override
    public void render() {
        System.out.println("Text rendering....");
    }

}
