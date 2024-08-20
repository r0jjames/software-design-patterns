package structural_patterns.proxy;

import structural_patterns.proxy.solution.Demo;

public class ProxyMain {
    public static void main(String[] args) {
      exampleTwo();
    }

    public static void exampleOne() {
        var library = new Library();
        String[] filesNames = {"a", "b", "c"};
        for (String fileName: filesNames) {
//            library.add(new EbookProxy(fileName));
            library.add(new LoadingEbookProxy(fileName));
        }

        library.openEbook("a");
        library.openEbook("b");
    }

    public static void exampleTwo() {
        Demo.show();
    }
}
