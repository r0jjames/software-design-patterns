package headfirst_examples.decorator;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }
    @Override
    protected double cost() {
        return 1.99;
    }
}
