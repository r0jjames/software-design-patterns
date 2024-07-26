package behavioral_patterns.command.solution;

public interface UndoableCommand extends Command {
    void undo();
}
