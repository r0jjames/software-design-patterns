package behavioral_patterns.command.solution;

public class UndoCommand implements Command {

    private final VideoHistory history;

    public UndoCommand(VideoHistory history) {
        this.history = history;
    }
    @Override
    public void execute() {
        System.out.println("UndoCommand execute");
        if (history.size() > 0) {
            this.history.pop().undo();
        }

    }
}
