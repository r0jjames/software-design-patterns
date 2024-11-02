package headfirst_examples.factory.pizzafactorymethod;

import headfirst_examples.factory.Pizza;
import headfirst_examples.factory.pizzafactorymethod.nystyle.NYStyleCheesePizza;
import headfirst_examples.factory.pizzafactorymethod.nystyle.NYStyleClamPizza;
import headfirst_examples.factory.pizzafactorymethod.nystyle.NYStylePepperoniPizza;
import headfirst_examples.factory.pizzafactorymethod.nystyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;

    }
}
