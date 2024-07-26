package behavioral_patterns.command.solution;

import java.util.ArrayDeque;
import java.util.Deque;

public class VideoHistory {
    Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push (UndoableCommand command) {
        commands.add(command);
    }

    public UndoableCommand pop() {
        return this.commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
