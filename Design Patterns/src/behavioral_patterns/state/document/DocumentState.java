package behavioral_patterns.state.document;

public interface DocumentState {
    void publish(Document document);
    void reject(Document document);
}
