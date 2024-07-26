package behavioral_patterns.command.editor;

public class BoldCommand implements UndoableCommand{

    private String prevContent;
    private final HTMLDocument document;
    private final History history;

    public BoldCommand(HTMLDocument document, History history) {
        this.document = document;
        this.history = history;
    }
    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        this.prevContent = document.getContent();
        this.document.makeBold();
        this.history.push(this);
    }
}
