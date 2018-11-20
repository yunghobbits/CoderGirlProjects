package patternMaker;


public class BlockyBaublePattern extends Pattern {
    //[]--o--[]--o--[]--o--

    public BlockyBaublePattern() {
    }

    @Override
    public void stitchCombo() {
        this.needleJam = (Math.random() < 0.10d);
        BlockStitch block = new BlockStitch();
        ShortLineStitch shortLine = new ShortLineStitch();
        CircleStitch circle = new CircleStitch();
        if (needleJam) {
            for (int i = 0; i < 1; i++) {
                block.sew();
                for (int j = 0; j < 2; j++) {
                    shortLine.sew();
                }
                circle.sew();
                for (int j = 0; j < 2; j++) {
                    shortLine.sew();
                }
                for (int j = 0; j < 1; j++) {
                    block.sew();
                    for (int k = 0; k < 2; k++) {
                        shortLine.sew();
                    }
                    circle.sew();
                }
            }
        } else {
            for (int i = 0; i < 3; i++) {
                block.sew();
                for (int j = 0; j < 2; j++) {
                    shortLine.sew();
                }
                circle.sew();
                for (int j = 0; j < 2; j++) {
                    shortLine.sew();
                }
            }
        }
    }
    public String toString() {
        return "Blocky Bauble Pattern";
    }
    public static void main(String[] args) {
        BlockyBaublePattern stitchIt = new BlockyBaublePattern();
        stitchIt.stitchCombo();
    }

}