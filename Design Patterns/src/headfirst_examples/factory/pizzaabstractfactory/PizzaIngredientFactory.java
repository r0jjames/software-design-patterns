package headfirst_examples.factory.pizzaabstractfactory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVegies();
    Pepperoni createPepperoni();
    Clams createClams();
}
