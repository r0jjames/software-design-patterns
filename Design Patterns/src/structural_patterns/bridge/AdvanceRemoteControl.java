package structural_patterns.bridge;

public class AdvanceRemoteControl extends RemoteControl {

    AdvanceRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int number) {
        device.setChannel(number);
    }
}
