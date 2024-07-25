package behavioral_patterns.stategy;

public class ImageStorage {

    public void store(String fileName, Compressor compressor, Filter filter) {
        compressor.compress(fileName);
        filter.apply(fileName);
    }
}
