package behavioral_patterns.state.document;

public class Document {
    private DocumentState documentState;

    public Document() {
        documentState = new DraftState();
    }
    public void publish() {
        documentState.publish(this);
    }

    public void reject() {
        documentState.reject(this);
    }

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }
}
