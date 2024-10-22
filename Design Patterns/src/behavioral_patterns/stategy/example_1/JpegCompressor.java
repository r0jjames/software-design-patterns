package behavioral_patterns.stategy.example_1;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing using JPG");
    }
}
