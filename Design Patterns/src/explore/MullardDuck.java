package explore;

public class MullardDuck extends Duck {
    public MullardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mullard duck!");
    }
}
