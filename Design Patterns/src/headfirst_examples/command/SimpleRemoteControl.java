package headfirst_examples.command;

public class SimpleRemoteControl {
    private Command slot;
    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonPressed() {
        slot.execute();
    }
}
