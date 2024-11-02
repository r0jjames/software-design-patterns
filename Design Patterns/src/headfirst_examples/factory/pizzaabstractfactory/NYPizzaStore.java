package headfirst_examples.factory.pizzaabstractfactory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(final String item) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        if (item.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("NY Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(factory);
            pizza.setName("NY Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(factory);
            pizza.setName("NY Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(factory);
            pizza.setName("NY Style Pepperoni Pizza");
        }
        return pizza;
    }
}
