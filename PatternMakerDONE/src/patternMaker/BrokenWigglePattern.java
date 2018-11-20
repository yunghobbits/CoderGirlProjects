package patternMaker;

public class BrokenWigglePattern extends Pattern {
    //xXxXxXxXxX

    @Override
    public void stitchCombo() {
        this.needleJam = (Math.random() < 0.40d);
        SmallCrossStitch smallX = new SmallCrossStitch();
        LargeCrossStitch largeX = new LargeCrossStitch();
        if (this.needleJam) {
            for (int i = 0; i < 2; i++) {
                smallX.sew();
                largeX.sew();
            }
            smallX.sew();
        } else {
            for (int i = 0; i < 5; i++) {
                smallX.sew();
                largeX.sew();
            }
        }
    }
    public String toString() {
        return "Broken Wiggle Pattern";
    }
    public static void main(String[] args) {
        BrokenWigglePattern stitchIt = new BrokenWigglePattern();
        stitchIt.stitchCombo();
    }

}