package headfirst_examples.factory.pizzaabstractfactory;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza("cheese");
        Pizza pizza = pizzaStore.createPizza("cheese");

        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

    }

}
