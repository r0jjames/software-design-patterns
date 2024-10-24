package practice.observer;

public class PracticeMain {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        Spreadsheet spreadsheet = new Spreadsheet(dataSource);
        Chart chart = new Chart(dataSource);
        dataSource.updateData("News");
    }
}
