package creational_patterns.builder;

import creational_patterns.builder.solution.Demo;

import java.io.IOException;

public class BuilderMain {
    public static void main(String[] args) throws IOException {
        Demo.show();
    }

    public static void exampleOne() {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        var builder = new PdfDocumentBuilder();
        presentation.export(builder);
        var pdf = builder.getPdfDocument();

        var builder2 = new MovieBuilder();
        presentation.export(builder2);
        var movie = builder2.getMovie();
    }
}
