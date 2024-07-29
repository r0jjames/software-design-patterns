package behavioral_patterns.chainOfResponsibility.solution;

public class QuickBookReader extends DataReader {
    @Override
    protected void doRead(String filename) {
        System.out.println("Reading data from an Quickbook Workspace.");
    }

    @Override
    protected String getExtension() {
        return ".qbw";
    }
}
