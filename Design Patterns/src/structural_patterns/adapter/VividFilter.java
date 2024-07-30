package structural_patterns.adapter;

public class VividFilter implements Filter{
    @Override
    public void apply(Image image) {
        System.out.println("Applied VividFilter");
    }
}
