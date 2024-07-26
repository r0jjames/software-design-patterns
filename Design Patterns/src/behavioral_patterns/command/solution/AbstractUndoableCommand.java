package behavioral_patterns.command.solution;

public abstract class AbstractUndoableCommand implements UndoableCommand{

    protected final VideoEditor editor;
    protected final VideoHistory history;

    public AbstractUndoableCommand(VideoEditor videoEditor, VideoHistory history) {
        this.editor = videoEditor;
        this.history = history;
    }

    @Override
    public void undo() {
        System.out.println("AbstractUndoableCommand undo");
        this.history.pop().undo();
    }

    @Override
    public void execute() {
        System.out.println("AbstractUndoableCommand execute");
        this.history.push(this);
        this.doExecute();
    }

    protected abstract void doExecute();

}
