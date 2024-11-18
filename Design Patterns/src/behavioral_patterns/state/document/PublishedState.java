package behavioral_patterns.state.document;

public class PublishedState implements DocumentState {
    @Override
    public void publish(Document document) {
        System.out.println("You already publish");
    }

    @Override
    public void reject(Document document) {
        System.out.println("Published document cannot be rejected.");
    }
}
