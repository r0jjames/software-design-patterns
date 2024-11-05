package headfirst_examples.adapter;

public class DuckAdapter implements Turkey{
    Duck duck;
    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
