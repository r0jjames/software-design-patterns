package behavioral_patterns.iterator.problem;

import java.util.ArrayList;
import java.util.List;

/*
In the Exercises project, look at the iterator/ProductCollection class. This class only allows us to add a product to a collection.
Once we add a bunch of products to a collection, there is no way to iterate that collection and print the products.
Implement this feature using the iterator pattern.
 */
public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

}
