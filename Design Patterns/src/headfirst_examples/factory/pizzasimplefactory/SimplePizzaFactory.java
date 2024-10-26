package headfirst_examples.factory.pizzasimplefactory;

import headfirst_examples.factory.Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("Cheeze")) {
            pizza = new CheesePizza();
        } else if (type.equals("Veggie")) {
            pizza = new VeggiePizza();
        } else if (type.equals("Pepperoni")) {
            pizza = new PepperoniPizza();
        }
        return pizza;
    }
}
