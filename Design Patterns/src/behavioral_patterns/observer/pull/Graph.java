package behavioral_patterns.observer.pull;

import behavioral_patterns.observer.example_1.DataSource;
import behavioral_patterns.observer.example_1.Observer;

public class Graph implements Observer {
    private DataSource dataSource;
    public Graph(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public void update() {
        System.out.println("Graph got updated with: " + dataSource.getText());
    }
}
