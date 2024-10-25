package structural_patterns.decorator.example_1;

public class EncryptedCloudStream implements Stream {
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        stream.write(encrypted);
    }

    public String encrypt(String data) {
        return "543@34256^#$%@#$@#$^%#$^@#";
    }
}
