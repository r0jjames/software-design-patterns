package behavioral_patterns.observer;

// Concrete Observer
public class Spreadsheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet got notified.");
    }
}
