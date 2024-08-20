package structural_patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private final Map<String, Ebook> Ebooks = new HashMap<>();

    public void add(Ebook ebook) {
        Ebooks.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName) {
        Ebooks.get(fileName).show();
    }
}
