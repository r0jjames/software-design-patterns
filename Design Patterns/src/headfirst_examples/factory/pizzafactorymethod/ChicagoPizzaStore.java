package headfirst_examples.factory.pizzafactorymethod;

import headfirst_examples.factory.Pizza;
import headfirst_examples.factory.pizzafactorymethod.chicagostyle.ChicagoStyleCheesePizza;
import headfirst_examples.factory.pizzafactorymethod.chicagostyle.ChicagoStyleClamPizza;
import headfirst_examples.factory.pizzafactorymethod.chicagostyle.ChicagoStylePepperoniPizza;
import headfirst_examples.factory.pizzafactorymethod.chicagostyle.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
