package practice.observer;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Subject {
    private List<Observer> observers;
    private String data;
    public DataSource() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (var o : observers) {
            o.update();
        }
    }

    void updateData(String data) {
        this.data = data;
        notifyObserver();
    }

    public String getData() {
        return data;
    }
}
