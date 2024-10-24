package practice.observer;

public class Spreadsheet implements Observer{
    private DataSource dataSource;

    public Spreadsheet(DataSource dataSource) {
        this.dataSource = dataSource;
        this.dataSource.addObserver(this);
    }


    @Override
    public void update() {
        System.out.println("Updating the spreadsheet... received: " + dataSource.getData());
    }
}
