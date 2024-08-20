package structural_patterns.bridge;

public class SonyTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Sony: TurnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turnoff");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("Sony Channel: " + number);
    }
}
