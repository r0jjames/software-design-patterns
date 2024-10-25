package headfirst_examples.decorator;

public abstract class Beverage {
    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.TALL;
    protected String description;

    public String getDescription() {
        return description;
    }

    protected abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
