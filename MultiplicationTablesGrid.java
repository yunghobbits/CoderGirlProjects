import java.util.Scanner;
import static java.lang.System.out;

public class MultiplicationTableGrid {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.println("Welcome to Multiplication Tables");
        out.println("");
        out.println("How large would you like to see them?");
        int size = keyboard.nextInt();
        for (int number1 = 0; number1 <= size; number1++) {
            for (int number2 = 0; number2 <= size; number2++) {
                out.println(number1 + " * " + number2 + " = " + (number1 * number2));
            }
        }
    }
}
