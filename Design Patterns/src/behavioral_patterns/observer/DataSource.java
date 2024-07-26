package behavioral_patterns.observer;

public class DataSource extends Subject{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.notifyObservers();
    }
}
