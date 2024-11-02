package headfirst_examples.command;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        // Lights On
        simpleRemoteControl.setCommand(new LightOnCommand(new Light("")));
        simpleRemoteControl.buttonPressed();
        // Garage Open
        simpleRemoteControl.setCommand(new GarageDoorOpenCommand(new GarageDoor("")));
        simpleRemoteControl.buttonPressed();

    }
}
