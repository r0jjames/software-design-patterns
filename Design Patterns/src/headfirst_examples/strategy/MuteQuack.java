package headfirst_examples.strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
