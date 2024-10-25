package structural_patterns.decorator.example_1;

public class CloudStream implements Stream {

    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
