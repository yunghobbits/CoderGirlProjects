import static java.lang.System.out;
import java.util.Scanner;

public class GroceryList
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        out.println("Please lists three items on your grocery shopping lists.");
        
        String Item1;
        out.print("Item 1? ");
        Item1 = keyboard.nextLine();
        out.println("");
        
        String Item2;
        out.print("Item 2? ");
        Item2 = keyboard.nextLine( );
        out.println("");
        
        String Item3;
        out.print("Item 3? ");
        Item3 = keyboard.nextLine( );
        out.println("");
        
        out.println("Now, pleas enter the quantity of each item.");
        
        int QItem1;
        out.print("How many " + Item1 + " ? ");
        QItem1 = keyboard.nextInt();
        out.println("");
        
        int QItem2;
        out.print("How many " + Item2 + " ? ");
        QItem2 = keyboard.nextInt();
        out.println("");
        
        int QItem3;
        out.print("How many " + Item3 + " ? ");
        QItem3 = keyboard.nextInt();
        out.println("");
        
        out.println("Now, please enter the price of each item");
        
        float costItem1;
        out.print("How much does one " + Item1 + " cost ? ");
        costItem1 = keyboard.nextFloat();
        out.println("");
        
        float costItem2;
        out.print("How much does one " + Item2 + " cost ? ");
        costItem2 = keyboard.nextFloat();
        out.println("");
        
        float costItem3;
        out.print("How much does one " + Item3 + " cost ? ");
        costItem3 = keyboard.nextFloat();
        out.println("");
        
        out.println("Calculating your grocery bill.");
        Float TItem1 = QItem1 * costItem1;
        Float TItem2 = QItem2 * costItem2;
        Float TItem3 = QItem3 * costItem3;
        Float Total = TItem1 + TItem2 + TItem3;
        out.println("Your total cost is " + Total);
    }
}