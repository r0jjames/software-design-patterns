package structural_patterns.adapter;

public class ImageView {
    private Image image;

    void apply(Filter filter) {
        filter.apply(image);
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
