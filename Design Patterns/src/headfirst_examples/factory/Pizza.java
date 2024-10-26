package headfirst_examples.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;

    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Prepare: " + name);
        System.out.println("Tossing dough....");
        System.out.println("Adding sauce....");
        System.out.println("Adding toppings");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 30 mins at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal size");
    }

    public void box() {
        System.out.println("Place pizza in a official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}

