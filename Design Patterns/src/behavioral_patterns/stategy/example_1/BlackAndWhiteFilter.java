package behavioral_patterns.stategy.example_1;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Blacking and White Filter");
    }
}
