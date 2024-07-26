package behavioral_patterns.command.fx;

public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        this.command.execute();
    }
 }
