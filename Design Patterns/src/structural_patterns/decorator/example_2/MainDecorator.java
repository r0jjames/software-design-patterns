package structural_patterns.decorator.example_2;

public class MainDecorator implements Decorator {
    private Decorator marker;

    public MainDecorator(Decorator marker) {
        this.marker = marker;
    }

    @Override
    public String render() {
        String mainIcon = marker.render();
        return mainIcon + " [Main]";
    }
}
