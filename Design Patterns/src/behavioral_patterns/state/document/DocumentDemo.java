package behavioral_patterns.state.document;

public class DocumentDemo {
    public static void main(String[] args) {
        Document document = new Document();
        document.publish();
        document.publish();
        document.reject();
    }
}
