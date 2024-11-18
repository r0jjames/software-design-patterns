package behavioral_patterns.state.document;

public class DraftState implements DocumentState {

    @Override
    public void publish(Document document) {
        System.out.println("Document moved to moderation");
        document.setDocumentState(new ModerationState());
    }

    @Override
    public void reject(Document document) {
        System.out.println("Draft cannot be rejected.");
    }
}
