package behavioral_patterns.visitor.solution;

public class NoiseReductionFilter implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Noise reduction on format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Noise reduction on fact segment");
    }
}
