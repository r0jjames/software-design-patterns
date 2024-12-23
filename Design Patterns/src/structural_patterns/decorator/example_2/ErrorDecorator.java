package structural_patterns.decorator.example_2;

public class ErrorDecorator implements Decorator {
    private Decorator marker;

    public ErrorDecorator(Decorator marker) {
        this.marker = marker;
    }
    @Override
    public String render() {
        String errorIcon =  this.marker.render();
        return errorIcon + " [Error]";
    }
}
