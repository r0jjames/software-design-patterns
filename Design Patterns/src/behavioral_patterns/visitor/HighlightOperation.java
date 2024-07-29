package behavioral_patterns.visitor;

public class HighlightOperation implements Operation {
    @Override
    public void apply(HeadingNode headingNode) {
        System.out.println("Highlighting heading");
    }

    @Override
    public void apply(AnchorNode anchorNode) {
        System.out.println("Highlighting anchor");
    }
}
