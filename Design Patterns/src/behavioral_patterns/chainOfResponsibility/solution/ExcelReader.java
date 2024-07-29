package behavioral_patterns.chainOfResponsibility.solution;

public class ExcelReader extends DataReader {

    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from an Excel spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".xls";
    }
}
