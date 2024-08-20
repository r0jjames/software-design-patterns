package structural_patterns.flyweight.solution;

import java.util.Objects;

public class CellContext {
    private String fontFamily;
    private int fontSize;
    private boolean isBold;

    public CellContext(String fontFamily, int fontSize, boolean isBold) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.isBold = isBold;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public boolean isBold() {
        return isBold;
    }

    public void setBold(boolean bold) {
        isBold = bold;
    }

    @Override
    public boolean equals(Object obj) {
        CellContext cellContext = (CellContext) obj;

        return fontFamily.equals(cellContext.getFontFamily()) && fontSize == cellContext.getFontSize() && isBold == cellContext.isBold;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fontFamily, fontSize, isBold);
    }
}
