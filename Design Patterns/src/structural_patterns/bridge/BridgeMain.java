package structural_patterns.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        var remoteControl = new AdvanceRemoteControl(new SonyTV());
        remoteControl.turnOn();
        remoteControl.setChannel(10);
    }
}
