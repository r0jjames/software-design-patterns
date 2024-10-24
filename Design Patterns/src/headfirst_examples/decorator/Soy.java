package headfirst_examples.decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    protected double cost() {
        return beverage.cost() + 1.0;
    }
}
