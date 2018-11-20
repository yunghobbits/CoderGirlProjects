package patternMaker;

public class ZigZagLinesPattern extends Pattern {
    //ZZZ===ZZZ===
    @Override
    public void stitchCombo() {
        FillStitch fill = new FillStitch();
        ZigZagStitch zigZag = new ZigZagStitch();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                zigZag.sew();
            }
            for (int k = 0; k < 3; k++) {
                fill.sew();
            }
        }
    }
    public String toString() {
        return "Zig Zag Lines Pattern";
    }
    public static void main(String[] args) {
        ZigZagLinesPattern stitchIt = new ZigZagLinesPattern();
        stitchIt.stitchCombo();
    }
}