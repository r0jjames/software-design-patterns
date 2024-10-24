package headfirst_examples.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    protected double cost() {
        return beverage.cost() + .90;
    }
}
