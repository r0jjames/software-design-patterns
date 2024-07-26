package behavioral_patterns.command.solution;

public class SetContrastCommand extends AbstractUndoableCommand {
    private float contrast;
    private float prevContrast;
    private final VideoEditor videoEditor;

    public SetContrastCommand(float contrast, VideoEditor videoEditor, VideoHistory history) {
        super(videoEditor, history);
        this.videoEditor = videoEditor;
        this.contrast = contrast;
    }

    @Override
    public void undo() {
        this.videoEditor.setContrast(prevContrast);
    }

    @Override
    public void doExecute() {
        this.prevContrast = this.videoEditor.getContrast();
        this.videoEditor.setContrast(contrast);

    }
}
