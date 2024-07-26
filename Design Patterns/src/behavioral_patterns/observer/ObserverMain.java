package behavioral_patterns.observer;

import behavioral_patterns.observer.pull.Graph;
import behavioral_patterns.observer.solution.StatusBar;
import behavioral_patterns.observer.solution.Stock;
import behavioral_patterns.observer.solution.StockListView;

public class ObserverMain {
    public static void main(String[] args) {
        // Implementation
//        var dataSource = new DataSource();
//        dataSource.setText("Data 1");
//        var spreadsheet1 = new Spreadsheet();
//        var spreadsheet2 = new Spreadsheet();
//        var chart = new Chart();
//        var graph = new Graph(dataSource);
//        dataSource.addObserver(spreadsheet1);
//        dataSource.addObserver(spreadsheet2);
//        dataSource.addObserver(chart);
//        dataSource.addObserver(graph);
//        dataSource.notifyObservers();

        // Stock Problem
        var statusBar = new StatusBar();
        var stockListView = new StockListView();

        var stock1 = new Stock("stock1", 10);
        var stock2 = new Stock("stock2", 20);
        var stock3 = new Stock("stock3", 30);

        // The status bar shows the popular stocks
        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        // The stock view list shows all stocks
        stockListView.addStock(stock1);
        stockListView.addStock(stock2);
        stockListView.addStock(stock3);

        // Causes both statusBar and stockListView to get refreshed
        stock2.setPrice(21);

        // Causes only the stockListView to get refreshed. (statusBar
        // is not watching this stock.)
        stock3.setPrice(9);
    }
}
