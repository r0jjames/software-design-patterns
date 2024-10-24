package headfirst_examples.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }
    @Override
    protected double cost() {
        return .40;
    }
}
