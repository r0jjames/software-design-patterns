package behavioral_patterns.observer.example_2;


import java.util.ArrayList;
import java.util.List;

public class StockSubject {
    List<StockObserver> observers = new ArrayList<>();

    public void addObserver(StockObserver observer) {
        this.observers.add(observer);
    }

    public void notifyObservers() {
        for (var observer: observers) {
            observer.priceChanged();
        }
    }
}
