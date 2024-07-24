package behavioral_patterns.memento.solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    Deque<DocumentMemento> documentMementos = new ArrayDeque<>();

    public void push(DocumentMemento documentMemento) {
        documentMementos.push(documentMemento);
    }

    public DocumentMemento pop() {
        return documentMementos.pop();
    }
}
