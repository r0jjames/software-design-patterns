package practice.observer;

public class Chart implements Observer{
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
        this.dataSource.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Chart is updating.... and received: " + dataSource.getData());
    }
}
