package structural_patterns.decorator;

public class CloudStream implements Stream {

    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
