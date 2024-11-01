package headfirst_examples.command;

public class Light {
    private String location;
    public Light(String location) {
        this.location = location;
    }

    void on() {
        System.out.println("Light is on!");
    }

    void off() {
        System.out.println("Light is off!");
    }
}
