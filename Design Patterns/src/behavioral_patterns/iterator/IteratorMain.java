package behavioral_patterns.iterator;

import behavioral_patterns.iterator.solution.Product;
import behavioral_patterns.iterator.solution.ProductCollection;

public class IteratorMain {
    public static void main(String[] args) {

        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Apple"));
        productCollection.add(new Product(2, "Samsung"));
        productCollection.add(new Product(3, "Nokia"));
        Iterator prodIterator = productCollection.createIterator();

        while (prodIterator.hasNext()) {
            Product product = (Product) prodIterator.current();
            System.out.println(product);
            prodIterator.next();
        }
        var browser = new BrowserHistory();
        browser.push("Instagram");
        browser.push("Facebook");
        browser.push("Twitter");
        Iterator<String> browserIterator = browser.createIterator();
        while(browserIterator.hasNext()) {
            String url = browserIterator.current();
            System.out.println(url);
            browserIterator.next();
        }

    }
}
