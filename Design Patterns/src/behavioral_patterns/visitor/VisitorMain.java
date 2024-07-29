package behavioral_patterns.visitor;

import behavioral_patterns.visitor.solution.NoiseReductionFilter;
import behavioral_patterns.visitor.solution.NormalizeFilter;
import behavioral_patterns.visitor.solution.ReverbFilter;
import behavioral_patterns.visitor.solution.WavFile;

public class VisitorMain {
    public static void main(String[] args) {
        // Example 1:
        var document = new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighlightOperation());
        document.execute(new PlaintextOperation());
        System.out.println("-------");
        // Example 2:
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
    }
}
