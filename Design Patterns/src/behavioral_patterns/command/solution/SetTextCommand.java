package behavioral_patterns.command.solution;

public class SetTextCommand extends AbstractUndoableCommand {
    private String text;
    private final VideoEditor videoEditor;

    public SetTextCommand(String text, VideoEditor videoEditor, VideoHistory history) {
        super(videoEditor, history);
        this.text = text;
        this.videoEditor = videoEditor;
    }

    @Override
    public void undo() {
        this.videoEditor.removeText();
    }

    @Override
    public void doExecute() {
        this.videoEditor.setText(this.text);
    }
}
