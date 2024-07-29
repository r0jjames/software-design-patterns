package behavioral_patterns.chainOfResponsibility.solution;

public class NumberReader extends DataReader {
    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from an Number spreadsheet.");
    }

    @Override
    protected String getExtension() {
        return ".numbers";
    }
}
