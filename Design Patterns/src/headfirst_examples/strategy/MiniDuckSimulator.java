package headfirst_examples.strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MullardDuck();
        duck.performQuack();
        duck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();
    }
}
