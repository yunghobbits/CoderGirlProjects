package patternMaker;
import java.util.Scanner;

public class TapestryController {
    private Pattern currentPattern = null;
    public void menu(){
        Scanner keyboard = new Scanner(System.in);

        Pattern[] allPatterns = new Pattern[5];
        allPatterns[0] = new CrossStitchWigglePattern();
        allPatterns[1] = new ZigZagLinesPattern();

        allPatterns[2] = new BaublePattern();
        allPatterns[3] = new BlockyBaublePattern();
        allPatterns[4] = new BrokenWigglePattern();
        System.out.println("Please type in the number corresponding to the pattern that you would like to print.");
        for (int i = 0; i < allPatterns.length; i++) {
            System.out.println(i + 1 + ". " + allPatterns[i]);
        }
        System.out.println("6. Print ALL Patterns");
        int whichPattern = keyboard.nextInt();
        if (whichPattern < 6) {
            currentPattern = allPatterns[whichPattern - 1];
            System.out.println();
            System.out.println("Printing: " + currentPattern + ".");
            System.out.println();
            printTapestry(currentPattern);
            keyboard.skip("\n");
            System.out.println("Enter any key to display the Main Menu");
            String enter = keyboard.nextLine();
            if (enter != null) {
                menu();
            }
        } else {
            for (int j = 0; j < allPatterns.length; j++) {
                printTapestry(allPatterns[j]);
            }
            keyboard.skip("\n");
            System.out.println("Enter any key to display the Main Menu");
            String enter = keyboard.nextLine();
            if (enter != null) {
                menu();
            }
        }
    }

    public void printTapestry(Pattern pattern) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 8; j++) {
                pattern.stitchCombo();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int k = 0; k < 8; k++) {
            for (int l = 0 ; l < 6; l++) {
                pattern.stitchCombo();
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();

    }
    public static void main(String[] args) {
        TapestryController tapestryController = new TapestryController();
        tapestryController.menu();
    }
}