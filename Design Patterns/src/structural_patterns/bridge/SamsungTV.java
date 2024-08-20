package structural_patterns.bridge;

public class SamsungTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("Samsung: TurnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: TurnOff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Samsung Channel: " + number);
    }
}
