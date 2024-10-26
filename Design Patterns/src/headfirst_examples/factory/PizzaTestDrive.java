package headfirst_examples.factory;

import headfirst_examples.factory.pizzafactorymethod.ChicagoPizzaStore;
import headfirst_examples.factory.pizzafactorymethod.NYPizzaStore;
import headfirst_examples.factory.pizzafactorymethod.PizzaStore;
import headfirst_examples.factory.pizzasimplefactory.SimplePizzaFactory;
import headfirst_examples.factory.pizzasimplefactory.SimplePizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        simpleFactory();
    }

    public static void simpleFactory() {
        SimplePizzaStore simplePizzaStore = new SimplePizzaStore(new SimplePizzaFactory());
        simplePizzaStore.orderPizza("Cheeze");

    }

    public static void factoryMethod() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
