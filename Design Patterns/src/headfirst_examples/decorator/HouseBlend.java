package headfirst_examples.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override

    protected double cost() {
        return .89;
    }
}
