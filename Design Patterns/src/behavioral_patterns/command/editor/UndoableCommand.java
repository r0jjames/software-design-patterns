package behavioral_patterns.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
