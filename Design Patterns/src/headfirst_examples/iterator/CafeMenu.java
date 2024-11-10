package headfirst_examples.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu {
    Map<String, MenuItem> menuItems = new HashMap<>();

    CafeMenu() {
        // Add items here
        addItem("Veggie burger and fries", "This is description", true, 2.42);
        addItem("Soup of the day", "This is description", false, 3.42);
        addItem("Burrito", "This is description", true, 4.42);
    }

    public void addItem(String name, String description,
                       boolean vegetarian, double price) {
        menuItems.put(name, new MenuItem(name, description, vegetarian, price));
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
