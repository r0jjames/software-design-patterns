package behavioral_patterns.iterator;

public class IteratorMain {
    public static void main(String[] args) {
        var browser = new BrowserHistory();
        browser.push("Instagram");
        browser.push("Facebook");
        browser.push("Twitter");
        Iterator iterator = browser.createIterator();
        while(iterator.hasNext()) {
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

    }
}
