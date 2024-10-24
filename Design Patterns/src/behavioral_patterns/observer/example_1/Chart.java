package behavioral_patterns.observer.example_1;

// Concrete Observer
public class Chart implements Observer{
    @Override
    public void update() {
        System.out.println("Chart got updated");
    }
}
