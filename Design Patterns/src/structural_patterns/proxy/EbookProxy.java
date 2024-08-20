package structural_patterns.proxy;

public class EbookProxy implements Ebook {
    private String fileName;
    public RealEbook ebook;
    public EbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null)
            ebook = new RealEbook(fileName);

        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
