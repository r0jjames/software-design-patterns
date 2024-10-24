package behavioral_patterns.observer.example_2;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements StockObserver {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println(stock);
    }

    @Override
    public void priceChanged() {
        System.out.println("Price Changed - Refreshing StatusBar");
        show();
    }
}
