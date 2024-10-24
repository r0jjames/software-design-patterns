package behavioral_patterns.observer.example_1;

import java.util.ArrayList;
import java.util.List;
// Subject
public class Subject {
    List<Observer> observers = new ArrayList<>();
    protected void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    protected void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    protected void notifyObservers() {
        for (var observer: observers) {
            observer.update();
        }
    }

}
