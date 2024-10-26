package headfirst_examples.factory.pizzasimplefactory;

import headfirst_examples.factory.Pizza;

public class SimplePizzaStore {
    SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
