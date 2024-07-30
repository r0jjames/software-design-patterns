package structural_patterns.decorator;

import structural_patterns.decorator.solution.Editor;

public class DecoratorMain {
    public static void main(String[] args) {
        // Example 1:
//        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
        // Example 2:
        var editor = new Editor();
        editor.openProject("...");
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-1234-1234-1234");
    }
}
