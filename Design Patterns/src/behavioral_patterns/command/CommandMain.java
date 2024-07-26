package behavioral_patterns.command;

import behavioral_patterns.command.editor.BoldCommand;
import behavioral_patterns.command.editor.HTMLDocument;
import behavioral_patterns.command.editor.History;
import behavioral_patterns.command.editor.UndoCommand;
import behavioral_patterns.command.fx.Button;

public class CommandMain {
    public static void main(String[] args) {
        // Example 1: Command Pattern
        var service = new CustomerService();
        var command = new AddCustomerCommand(service);
        Button button = new Button(command);

        button.click();
        System.out.println("-----------------");
        // Example 2: // Replay all commands using Composite Command Pattern
        var composite = new CompositeCommand();
        composite.addCommand(new ResizeCommand());
        composite.addCommand(new BlackAndWhiteCommand());
        composite.execute();
        System.out.println("-----------------");
        // Example 3: Undo command using Undoable Command Pattern
        var document = new HTMLDocument("Hello");
        var history = new History();
        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
