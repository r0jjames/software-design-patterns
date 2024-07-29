package behavioral_patterns.chainOfResponsibility.solution;

public class DataReaderFactory {
    public static DataReader getDataReaderChain() {
        var excel = new ExcelReader();
        var number = new NumberReader();
        var quickBook = new QuickBookReader();
        quickBook.setNext(number);
        number.setNext(excel);
        return quickBook;
    }
}
