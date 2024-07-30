package structural_patterns.decorator;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compress = data.substring(1, 5);
        System.out.println(compress);
        this.stream.write(compress);
    }

}
