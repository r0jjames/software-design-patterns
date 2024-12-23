package headfirst_examples.factory.pizzafactorymethod;

import headfirst_examples.factory.Pizza;

public abstract class PizzaStore {
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String item) {
        Pizza pizza = createPizza(item);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
