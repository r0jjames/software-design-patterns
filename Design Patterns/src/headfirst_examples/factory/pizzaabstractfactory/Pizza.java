package headfirst_examples.factory.pizzaabstractfactory;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();
    public void bake() {
        System.out.println("Bake for 20 mins at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal size");
    }

    public void box() {
        System.out.println("Place pizza in a official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

}
