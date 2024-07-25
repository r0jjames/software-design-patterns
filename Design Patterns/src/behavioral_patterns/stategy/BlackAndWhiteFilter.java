package behavioral_patterns.stategy;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply(String fileName) {
        System.out.println("Applying Blacking and White Filter");
    }
}
