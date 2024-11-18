package behavioral_patterns.state.document;

public class ModerationState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("Document Published");
        document.setDocumentState(new PublishedState());
    }

    @Override
    public void reject(Document document) {
        System.out.println("Document is sent back to Draft.");
        document.setDocumentState(new DraftState());
    }
}
