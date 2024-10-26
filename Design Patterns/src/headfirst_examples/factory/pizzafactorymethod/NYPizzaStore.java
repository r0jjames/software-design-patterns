package headfirst_examples.factory.pizzafactorymethod;

import headfirst_examples.factory.Pizza;
import headfirst_examples.factory.pizzafactorymethod.nystyle.NYStyleCheesePizza;
import headfirst_examples.factory.pizzafactorymethod.nystyle.NYStyleClamPizza;
import headfirst_examples.factory.pizzafactorymethod.nystyle.NYStylePepperoniPizza;
import headfirst_examples.factory.pizzafactorymethod.nystyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (type.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;

    }
}
