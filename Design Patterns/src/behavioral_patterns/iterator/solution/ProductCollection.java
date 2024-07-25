package behavioral_patterns.iterator.solution;

import behavioral_patterns.iterator.Iterator;

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
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  public Iterator createIterator() {
    return new ListIterator(this);
  }


  public class ListIterator implements Iterator {

    private final ProductCollection collection;
    private int index;
    public ListIterator(ProductCollection productCollection) {

      this.collection = productCollection;
    }

    @Override
    public boolean hasNext() {
      return this.index < collection.getProducts().size();
    }

    @Override
    public Object current() {
      return this.collection.getProducts().get(index);
    }


    @Override
    public void next() {
      index++;
    }
  }

}
