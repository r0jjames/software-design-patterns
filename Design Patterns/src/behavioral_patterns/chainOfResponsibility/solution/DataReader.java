package behavioral_patterns.chainOfResponsibility.solution;

public abstract class DataReader {
    private DataReader next;

    public void setNext(DataReader next) {
        this.next = next;
    }

    public void read(String filename) {
        if(filename.endsWith(getExtension())) {
            doRead(filename);
            return;
        }

        if(this.next!= null) {
            this.next.read(filename);
        } else {
            throw new UnsupportedOperationException("File format is not supported");
        }
    }

    protected abstract void doRead(String filename);
    protected abstract String getExtension();


}
