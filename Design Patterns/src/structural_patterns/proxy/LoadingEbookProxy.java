package structural_patterns.proxy;

public class LoadingEbookProxy implements Ebook {

    private String fileName;
    private RealEbook ebook;

    LoadingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if (ebook == null) {
            ebook = new RealEbook(fileName);
        }
        System.out.println("Logging......");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
