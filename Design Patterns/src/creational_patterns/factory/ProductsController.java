package creational_patterns.factory;

import creational_patterns.factory.matcha.Controller;

import java.util.HashMap;
import java.util.Map;

public class ProductsController extends Controller {
    public void listOfProducts() {
        // Get products from the Database
        var products = "products";
        Map<String, Object> context = new HashMap<>();
        context.put(products, new Object());
        render("products.html", context);
    }
}
