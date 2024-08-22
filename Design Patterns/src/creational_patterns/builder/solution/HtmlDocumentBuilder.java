package creational_patterns.builder.solution;


import creational_patterns.builder.solution.html.HtmlDocument;
import creational_patterns.builder.solution.html.HtmlImage;
import creational_patterns.builder.solution.html.HtmlParagraph;

public class HtmlDocumentBuilder implements DocumentBuilder {
    private HtmlDocument document = new HtmlDocument();

    @Override
    public void addText(Text text) {
        document.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public void addImage(Image image) {
        document.add(new HtmlImage(image.getSource()));
    }

    @Override
    public String getResult() {
        return document.toString();
    }
}
