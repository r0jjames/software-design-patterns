package behavioral_patterns.observer.example_1;

// Concrete Observer
public class Spreadsheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet got notified.");
    }
}
