package headfirst_examples.decorator;

public abstract class Beverage {
    protected String description;

    public String getDescription() {
        return description;
    }
    protected abstract double cost();
}
