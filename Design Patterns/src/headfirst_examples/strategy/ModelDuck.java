package headfirst_examples.strategy;

public class ModelDuck extends Duck {
    ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Model Duck");
    }
}
